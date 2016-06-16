package com.huiwu.temperaturecontrol.sqlite.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.huiwu.temperaturecontrol.sqlite.bean.TagInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "TAG_INFO".
 */
public class TagInfoDao extends AbstractDao<TagInfo, Long> {

    public static final String TABLENAME = "TAG_INFO";

    /**
     * Properties of entity TagInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Uid = new Property(1, String.class, "uid", false, "UID");
        public final static Property Linkuuid = new Property(2, String.class, "linkuuid", false, "LINKUUID");
        public final static Property Box = new Property(3, String.class, "box", false, "BOX");
        public final static Property Goods = new Property(4, String.class, "goods", false, "GOODS");
        public final static Property Object = new Property(5, String.class, "object", false, "OBJECT");
        public final static Property Bover = new Property(6, Boolean.class, "bover", false, "BOVER");
        public final static Property ReadTime = new Property(7, Long.class, "readTime", false, "READ_TIME");
        public final static Property StartTime = new Property(8, Long.class, "startTime", false, "START_TIME");
        public final static Property EndTime = new Property(9, Long.class, "endTime", false, "END_TIME");
        public final static Property Power = new Property(10, Integer.class, "power", false, "POWER");
        public final static Property RecordStatus = new Property(11, Integer.class, "recordStatus", false, "RECORD_STATUS");
        public final static Property TempMin = new Property(12, Double.class, "tempMin", false, "TEMP_MIN");
        public final static Property TempMax = new Property(13, Double.class, "tempMax", false, "TEMP_MAX");
        public final static Property HumMin = new Property(14, Double.class, "humMin", false, "HUM_MIN");
        public final static Property HumMax = new Property(15, Double.class, "humMax", false, "HUM_MAX");
        public final static Property IsOutLimit = new Property(16, Boolean.class, "isOutLimit", false, "IS_OUT_LIMIT");
        public final static Property Dataarray = new Property(17, String.class, "dataarray", false, "DATAARRAY");
        public final static Property HumidityArray = new Property(18, String.class, "humidityArray", false, "HUMIDITY_ARRAY");
        public final static Property JustTemp = new Property(19, Boolean.class, "justTemp", false, "JUST_TEMP");
        public final static Property RoundCircle = new Property(20, Integer.class, "roundCircle", false, "ROUND_CIRCLE");
        public final static Property Number = new Property(21, Integer.class, "number", false, "NUMBER");
        public final static Property Havepost = new Property(22, Boolean.class, "havepost", false, "HAVEPOST");
    }

    ;


    public TagInfoDao(DaoConfig config) {
        super(config);
    }

    public TagInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"TAG_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"UID\" TEXT NOT NULL ," + // 1: uid
                "\"LINKUUID\" TEXT NOT NULL ," + // 2: linkuuid
                "\"BOX\" TEXT," + // 3: box
                "\"GOODS\" TEXT," + // 4: goods
                "\"OBJECT\" TEXT," + // 5: object
                "\"BOVER\" INTEGER," + // 6: bover
                "\"READ_TIME\" INTEGER," + // 7: readTime
                "\"START_TIME\" INTEGER," + // 8: startTime
                "\"END_TIME\" INTEGER," + // 9: endTime
                "\"POWER\" INTEGER," + // 10: power
                "\"RECORD_STATUS\" INTEGER," + // 11: recordStatus
                "\"TEMP_MIN\" REAL," + // 12: tempMin
                "\"TEMP_MAX\" REAL," + // 13: tempMax
                "\"HUM_MIN\" REAL," + // 14: humMin
                "\"HUM_MAX\" REAL," + // 15: humMax
                "\"IS_OUT_LIMIT\" INTEGER," + // 16: isOutLimit
                "\"DATAARRAY\" TEXT," + // 17: dataarray
                "\"HUMIDITY_ARRAY\" TEXT," + // 18: humidityArray
                "\"JUST_TEMP\" INTEGER," + // 19: justTemp
                "\"ROUND_CIRCLE\" INTEGER," + // 20: roundCircle
                "\"NUMBER\" INTEGER," + // 21: number
                "\"HAVEPOST\" INTEGER);"); // 22: havepost
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TAG_INFO\"";
        db.execSQL(sql);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected void bindValues(SQLiteStatement stmt, TagInfo entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getUid());
        stmt.bindString(3, entity.getLinkuuid());

        String box = entity.getBox();
        if (box != null) {
            stmt.bindString(4, box);
        }

        String goods = entity.getGoods();
        if (goods != null) {
            stmt.bindString(5, goods);
        }

        String object = entity.getObject();
        if (object != null) {
            stmt.bindString(6, object);
        }

        Boolean bover = entity.getBover();
        if (bover != null) {
            stmt.bindLong(7, bover ? 1L : 0L);
        }

        Long readTime = entity.getReadTime();
        if (readTime != null) {
            stmt.bindLong(8, readTime);
        }

        Long startTime = entity.getStartTime();
        if (startTime != null) {
            stmt.bindLong(9, startTime);
        }

        Long endTime = entity.getEndTime();
        if (endTime != null) {
            stmt.bindLong(10, endTime);
        }

        Integer power = entity.getPower();
        if (power != null) {
            stmt.bindLong(11, power);
        }

        Integer recordStatus = entity.getRecordStatus();
        if (recordStatus != null) {
            stmt.bindLong(12, recordStatus);
        }

        Double tempMin = entity.getTempMin();
        if (tempMin != null) {
            stmt.bindDouble(13, tempMin);
        }

        Double tempMax = entity.getTempMax();
        if (tempMax != null) {
            stmt.bindDouble(14, tempMax);
        }

        Double humMin = entity.getHumMin();
        if (humMin != null) {
            stmt.bindDouble(15, humMin);
        }

        Double humMax = entity.getHumMax();
        if (humMax != null) {
            stmt.bindDouble(16, humMax);
        }

        Boolean isOutLimit = entity.getIsOutLimit();
        if (isOutLimit != null) {
            stmt.bindLong(17, isOutLimit ? 1L : 0L);
        }

        String dataarray = entity.getDataarray();
        if (dataarray != null) {
            stmt.bindString(18, dataarray);
        }

        String humidityArray = entity.getHumidityArray();
        if (humidityArray != null) {
            stmt.bindString(19, humidityArray);
        }

        Boolean justTemp = entity.getJustTemp();
        if (justTemp != null) {
            stmt.bindLong(20, justTemp ? 1L : 0L);
        }

        Integer roundCircle = entity.getRoundCircle();
        if (roundCircle != null) {
            stmt.bindLong(21, roundCircle);
        }

        Integer number = entity.getNumber();
        if (number != null) {
            stmt.bindLong(22, number);
        }

        Boolean havepost = entity.getHavepost();
        if (havepost != null) {
            stmt.bindLong(23, havepost ? 1L : 0L);
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
    public TagInfo readEntity(Cursor cursor, int offset) {
        TagInfo entity = new TagInfo( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getString(offset + 1), // uid
                cursor.getString(offset + 2), // linkuuid
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // box
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // goods
                cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // object
                cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // bover
                cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7), // readTime
                cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8), // startTime
                cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // endTime
                cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // power
                cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // recordStatus
                cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12), // tempMin
                cursor.isNull(offset + 13) ? null : cursor.getDouble(offset + 13), // tempMax
                cursor.isNull(offset + 14) ? null : cursor.getDouble(offset + 14), // humMin
                cursor.isNull(offset + 15) ? null : cursor.getDouble(offset + 15), // humMax
                cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0, // isOutLimit
                cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // dataarray
                cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // humidityArray
                cursor.isNull(offset + 19) ? null : cursor.getShort(offset + 19) != 0, // justTemp
                cursor.isNull(offset + 20) ? null : cursor.getInt(offset + 20), // roundCircle
                cursor.isNull(offset + 21) ? null : cursor.getInt(offset + 21), // number
                cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0 // havepost
        );
        return entity;
    }

    /**
     * @inheritdoc
     */
    @Override
    public void readEntity(Cursor cursor, TagInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUid(cursor.getString(offset + 1));
        entity.setLinkuuid(cursor.getString(offset + 2));
        entity.setBox(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setGoods(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setObject(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setBover(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setReadTime(cursor.isNull(offset + 7) ? null : cursor.getLong(offset + 7));
        entity.setStartTime(cursor.isNull(offset + 8) ? null : cursor.getLong(offset + 8));
        entity.setEndTime(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setPower(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setRecordStatus(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setTempMin(cursor.isNull(offset + 12) ? null : cursor.getDouble(offset + 12));
        entity.setTempMax(cursor.isNull(offset + 13) ? null : cursor.getDouble(offset + 13));
        entity.setHumMin(cursor.isNull(offset + 14) ? null : cursor.getDouble(offset + 14));
        entity.setHumMax(cursor.isNull(offset + 15) ? null : cursor.getDouble(offset + 15));
        entity.setIsOutLimit(cursor.isNull(offset + 16) ? null : cursor.getShort(offset + 16) != 0);
        entity.setDataarray(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setHumidityArray(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setJustTemp(cursor.isNull(offset + 19) ? null : cursor.getShort(offset + 19) != 0);
        entity.setRoundCircle(cursor.isNull(offset + 20) ? null : cursor.getInt(offset + 20));
        entity.setNumber(cursor.isNull(offset + 21) ? null : cursor.getInt(offset + 21));
        entity.setHavepost(cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0);
    }

    /**
     * @inheritdoc
     */
    @Override
    protected Long updateKeyAfterInsert(TagInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /**
     * @inheritdoc
     */
    @Override
    public Long getKey(TagInfo entity) {
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
