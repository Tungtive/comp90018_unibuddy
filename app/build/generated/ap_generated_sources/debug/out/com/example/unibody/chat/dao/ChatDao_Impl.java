package com.example.unibody.chat.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.unibody.chat.domain.Chat;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ChatDao_Impl implements ChatDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Chat> __insertionAdapterOfChat;

  private final EntityDeletionOrUpdateAdapter<Chat> __deletionAdapterOfChat;

  private final EntityDeletionOrUpdateAdapter<Chat> __updateAdapterOfChat;

  public ChatDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChat = new EntityInsertionAdapter<Chat>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `chat` (`id`,`otherImage`,`name`,`lastMsg`,`lastTime`,`type`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Chat value) {
        stmt.bindLong(1, value.id);
        stmt.bindLong(2, value.otherImage);
        if (value.name == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.name);
        }
        if (value.lastMsg == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.lastMsg);
        }
        stmt.bindLong(5, value.lastTime);
        stmt.bindLong(6, value.type);
      }
    };
    this.__deletionAdapterOfChat = new EntityDeletionOrUpdateAdapter<Chat>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `chat` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Chat value) {
        stmt.bindLong(1, value.id);
      }
    };
    this.__updateAdapterOfChat = new EntityDeletionOrUpdateAdapter<Chat>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `chat` SET `id` = ?,`otherImage` = ?,`name` = ?,`lastMsg` = ?,`lastTime` = ?,`type` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Chat value) {
        stmt.bindLong(1, value.id);
        stmt.bindLong(2, value.otherImage);
        if (value.name == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.name);
        }
        if (value.lastMsg == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.lastMsg);
        }
        stmt.bindLong(5, value.lastTime);
        stmt.bindLong(6, value.type);
        stmt.bindLong(7, value.id);
      }
    };
  }

  @Override
  public void insertChatList(final Chat chat) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfChat.insert(chat);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteChat(final Chat chat) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfChat.handle(chat);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateLastChat(final Chat chat) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfChat.handle(chat);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Chat> getAllChatList() {
    final String _sql = "SELECT * FROM chat";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfOtherImage = CursorUtil.getColumnIndexOrThrow(_cursor, "otherImage");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfLastMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMsg");
      final int _cursorIndexOfLastTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTime");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final List<Chat> _result = new ArrayList<Chat>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Chat _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpOtherImage;
        _tmpOtherImage = _cursor.getInt(_cursorIndexOfOtherImage);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpLastMsg;
        _tmpLastMsg = _cursor.getString(_cursorIndexOfLastMsg);
        final long _tmpLastTime;
        _tmpLastTime = _cursor.getLong(_cursorIndexOfLastTime);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        _item = new Chat(_tmpId,_tmpOtherImage,_tmpName,_tmpLastMsg,_tmpLastTime,_tmpType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Chat getChatById(final int id) {
    final String _sql = "SELECT * FROM chat WHERE id = :id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfOtherImage = CursorUtil.getColumnIndexOrThrow(_cursor, "otherImage");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfLastMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "lastMsg");
      final int _cursorIndexOfLastTime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastTime");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final Chat _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpOtherImage;
        _tmpOtherImage = _cursor.getInt(_cursorIndexOfOtherImage);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpLastMsg;
        _tmpLastMsg = _cursor.getString(_cursorIndexOfLastMsg);
        final long _tmpLastTime;
        _tmpLastTime = _cursor.getLong(_cursorIndexOfLastTime);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        _result = new Chat(_tmpId,_tmpOtherImage,_tmpName,_tmpLastMsg,_tmpLastTime,_tmpType);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
