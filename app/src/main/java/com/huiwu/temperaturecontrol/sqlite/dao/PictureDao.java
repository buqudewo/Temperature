package com.huiwu.temperaturecontrol.sqlite.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.huiwu.temperaturecontrol.sqlite.bean.Picture;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "PICTURE".
 */
public class PictureDao extends AbstractDao<Picture, Long> {

    public static final String TABLENAME = "PICTURE";

    /**
     * Properties of entity Picture.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Boxno = new Property(1, String.class, "boxno", false, "BOXNO");
        public final static Property Linkuuid = new Property(2, String.class, "linkuuid", false, "LINKUUID");
        public final static Property File = new Property(3, String.class, "file", false, "FILE");
        public final static Property SealOropen = new Property(4, String.class, "sealOropen", false, "SEAL_OROPEN");
        public final static Property Havepost = new Property(5, Boolean.class, "havepost", false, "HAVEPOST");
    }

    ;


    public PictureDao(DaoConfig config) {
        super(config);
    }

    public PictureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"PICTURE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"BOXNO\" TEXT NOT NULL ," + // 1: boxno
                "\"LINKUUID\" TEXT NOT NULL ," + // 2: linkuuid
                "\"FILE\" TEXT NOT NULL ," + // 3: file
                "\"SEAL_OROPEN\" TEXT NOT NULL ," + // 4: sealOropen
                "\"HAVEPOST\" INTEGER);"); // 5: havepost
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"PICTURE\"";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, Picture entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getBoxno());
        stmt.bindString(3, entity.getLinkuuid());
        stmt.bindString(4, entity.getFile());
        stmt.bindString(5, entity.getSealOropen());

        Boolean havepost = entity.getHavepost();
        if (havepost != null) {
            stmt.bindLong(6, havepost ? 1L : 0L);
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    public Picture readEntity(Cursor cursor, int offset) {
        Picture entity = new Picture( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getString(offset + 1), // boxno
                cursor.getString(offset + 2), // linkuuid
                cursor.getString(offset + 3), // file
                cursor.getString(offset + 4), // sealOropen
                cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0 // havepost
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, Picture entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBoxno(cursor.getString(offset + 1));
        entity.setLinkuuid(cursor.getString(offset + 2));
        entity.setFile(cursor.getString(offset + 3));
        entity.setSealOropen(cursor.getString(offset + 4));
        entity.setHavepost(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(Picture entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(Picture entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /**
     * @inheritdoc
     */
    @Override
    protected boolean isEntityUpdateable() {
        return true;
    }

}
