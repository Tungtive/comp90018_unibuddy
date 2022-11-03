package com.example.unibody.chat.dao;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.unibody.chat.domain.ChatDetails;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ChatDetailsDao_Impl implements ChatDetailsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ChatDetails> __insertionAdapterOfChatDetails;

  private final EntityDeletionOrUpdateAdapter<ChatDetails> __deletionAdapterOfChatDetails;

  private final EntityDeletionOrUpdateAdapter<ChatDetails> __updateAdapterOfChatDetails;

  public ChatDetailsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfChatDetails = new EntityInsertionAdapter<ChatDetails>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `chat_details` (`id`,`target`,`time`,`msg`,`isMeSend`,`type`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChatDetails value) {
        stmt.bindLong(1, value.id);
        stmt.bindLong(2, value.target);
        stmt.bindLong(3, value.time);
        if (value.msg == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.msg);
        }
        final int _tmp;
        _tmp = value.isMeSend ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.type);
      }
    };
    this.__deletionAdapterOfChatDetails = new EntityDeletionOrUpdateAdapter<ChatDetails>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `chat_details` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChatDetails value) {
        stmt.bindLong(1, value.id);
      }
    };
    this.__updateAdapterOfChatDetails = new EntityDeletionOrUpdateAdapter<ChatDetails>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `chat_details` SET `id` = ?,`target` = ?,`time` = ?,`msg` = ?,`isMeSend` = ?,`type` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ChatDetails value) {
        stmt.bindLong(1, value.id);
        stmt.bindLong(2, value.target);
        stmt.bindLong(3, value.time);
        if (value.msg == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.msg);
        }
        final int _tmp;
        _tmp = value.isMeSend ? 1 : 0;
        stmt.bindLong(5, _tmp);
        stmt.bindLong(6, value.type);
        stmt.bindLong(7, value.id);
      }
    };
  }

  @Override
  public void insertChatDetails(final ChatDetails chatDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfChatDetails.insert(chatDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteChatDetails(final ChatDetails chatDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfChatDetails.handle(chatDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateChatDetails(final ChatDetails chatDetails) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfChatDetails.handle(chatDetails);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<ChatDetails> getAllChatDetailsByChatId(final int target) {
    final String _sql = "SELECT * FROM chat_details WHERE target = :target";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, target);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTarget = CursorUtil.getColumnIndexOrThrow(_cursor, "target");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfMsg = CursorUtil.getColumnIndexOrThrow(_cursor, "msg");
      final int _cursorIndexOfIsMeSend = CursorUtil.getColumnIndexOrThrow(_cursor, "isMeSend");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final List<ChatDetails> _result = new ArrayList<ChatDetails>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ChatDetails _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final int _tmpTarget;
        _tmpTarget = _cursor.getInt(_cursorIndexOfTarget);
        final long _tmpTime;
        _tmpTime = _cursor.getLong(_cursorIndexOfTime);
        final String _tmpMsg;
        _tmpMsg = _cursor.getString(_cursorIndexOfMsg);
        final boolean _tmpIsMeSend;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsMeSend);
        _tmpIsMeSend = _tmp != 0;
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        _item = new ChatDetails(_tmpId,_tmpTarget,_tmpTime,_tmpMsg,_tmpIsMeSend,_tmpType);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
