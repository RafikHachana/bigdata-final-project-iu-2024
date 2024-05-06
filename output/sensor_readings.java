// ORM class for table 'sensor_readings'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon May 06 20:51:40 MSK 2024
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import org.apache.sqoop.lib.JdbcWritableBridge;
import org.apache.sqoop.lib.DelimiterSet;
import org.apache.sqoop.lib.FieldFormatter;
import org.apache.sqoop.lib.RecordParser;
import org.apache.sqoop.lib.BooleanParser;
import org.apache.sqoop.lib.BlobRef;
import org.apache.sqoop.lib.ClobRef;
import org.apache.sqoop.lib.LargeObjectLoader;
import org.apache.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class sensor_readings extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("index", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.index = (Integer)value;
      }
    });
    setters.put("timestamp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.timestamp = (String)value;
      }
    });
    setters.put("tp2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.tp2 = (Double)value;
      }
    });
    setters.put("tp3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.tp3 = (Double)value;
      }
    });
    setters.put("h1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.h1 = (Double)value;
      }
    });
    setters.put("dv_pressure", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.dv_pressure = (Double)value;
      }
    });
    setters.put("reservoirs", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.reservoirs = (Double)value;
      }
    });
    setters.put("oil_temperature", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.oil_temperature = (Double)value;
      }
    });
    setters.put("motor_current", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.motor_current = (Double)value;
      }
    });
    setters.put("comp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.comp = (Double)value;
      }
    });
    setters.put("dv_eletric", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.dv_eletric = (Double)value;
      }
    });
    setters.put("towers", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.towers = (Double)value;
      }
    });
    setters.put("mpg", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.mpg = (Double)value;
      }
    });
    setters.put("lps", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.lps = (Double)value;
      }
    });
    setters.put("pressure_switch", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.pressure_switch = (Double)value;
      }
    });
    setters.put("oil_level", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.oil_level = (Double)value;
      }
    });
    setters.put("caudal_impulses", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        sensor_readings.this.caudal_impulses = (Double)value;
      }
    });
  }
  public sensor_readings() {
    init0();
  }
  private Integer index;
  public Integer get_index() {
    return index;
  }
  public void set_index(Integer index) {
    this.index = index;
  }
  public sensor_readings with_index(Integer index) {
    this.index = index;
    return this;
  }
  private String timestamp;
  public String get_timestamp() {
    return timestamp;
  }
  public void set_timestamp(String timestamp) {
    this.timestamp = timestamp;
  }
  public sensor_readings with_timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  private Double tp2;
  public Double get_tp2() {
    return tp2;
  }
  public void set_tp2(Double tp2) {
    this.tp2 = tp2;
  }
  public sensor_readings with_tp2(Double tp2) {
    this.tp2 = tp2;
    return this;
  }
  private Double tp3;
  public Double get_tp3() {
    return tp3;
  }
  public void set_tp3(Double tp3) {
    this.tp3 = tp3;
  }
  public sensor_readings with_tp3(Double tp3) {
    this.tp3 = tp3;
    return this;
  }
  private Double h1;
  public Double get_h1() {
    return h1;
  }
  public void set_h1(Double h1) {
    this.h1 = h1;
  }
  public sensor_readings with_h1(Double h1) {
    this.h1 = h1;
    return this;
  }
  private Double dv_pressure;
  public Double get_dv_pressure() {
    return dv_pressure;
  }
  public void set_dv_pressure(Double dv_pressure) {
    this.dv_pressure = dv_pressure;
  }
  public sensor_readings with_dv_pressure(Double dv_pressure) {
    this.dv_pressure = dv_pressure;
    return this;
  }
  private Double reservoirs;
  public Double get_reservoirs() {
    return reservoirs;
  }
  public void set_reservoirs(Double reservoirs) {
    this.reservoirs = reservoirs;
  }
  public sensor_readings with_reservoirs(Double reservoirs) {
    this.reservoirs = reservoirs;
    return this;
  }
  private Double oil_temperature;
  public Double get_oil_temperature() {
    return oil_temperature;
  }
  public void set_oil_temperature(Double oil_temperature) {
    this.oil_temperature = oil_temperature;
  }
  public sensor_readings with_oil_temperature(Double oil_temperature) {
    this.oil_temperature = oil_temperature;
    return this;
  }
  private Double motor_current;
  public Double get_motor_current() {
    return motor_current;
  }
  public void set_motor_current(Double motor_current) {
    this.motor_current = motor_current;
  }
  public sensor_readings with_motor_current(Double motor_current) {
    this.motor_current = motor_current;
    return this;
  }
  private Double comp;
  public Double get_comp() {
    return comp;
  }
  public void set_comp(Double comp) {
    this.comp = comp;
  }
  public sensor_readings with_comp(Double comp) {
    this.comp = comp;
    return this;
  }
  private Double dv_eletric;
  public Double get_dv_eletric() {
    return dv_eletric;
  }
  public void set_dv_eletric(Double dv_eletric) {
    this.dv_eletric = dv_eletric;
  }
  public sensor_readings with_dv_eletric(Double dv_eletric) {
    this.dv_eletric = dv_eletric;
    return this;
  }
  private Double towers;
  public Double get_towers() {
    return towers;
  }
  public void set_towers(Double towers) {
    this.towers = towers;
  }
  public sensor_readings with_towers(Double towers) {
    this.towers = towers;
    return this;
  }
  private Double mpg;
  public Double get_mpg() {
    return mpg;
  }
  public void set_mpg(Double mpg) {
    this.mpg = mpg;
  }
  public sensor_readings with_mpg(Double mpg) {
    this.mpg = mpg;
    return this;
  }
  private Double lps;
  public Double get_lps() {
    return lps;
  }
  public void set_lps(Double lps) {
    this.lps = lps;
  }
  public sensor_readings with_lps(Double lps) {
    this.lps = lps;
    return this;
  }
  private Double pressure_switch;
  public Double get_pressure_switch() {
    return pressure_switch;
  }
  public void set_pressure_switch(Double pressure_switch) {
    this.pressure_switch = pressure_switch;
  }
  public sensor_readings with_pressure_switch(Double pressure_switch) {
    this.pressure_switch = pressure_switch;
    return this;
  }
  private Double oil_level;
  public Double get_oil_level() {
    return oil_level;
  }
  public void set_oil_level(Double oil_level) {
    this.oil_level = oil_level;
  }
  public sensor_readings with_oil_level(Double oil_level) {
    this.oil_level = oil_level;
    return this;
  }
  private Double caudal_impulses;
  public Double get_caudal_impulses() {
    return caudal_impulses;
  }
  public void set_caudal_impulses(Double caudal_impulses) {
    this.caudal_impulses = caudal_impulses;
  }
  public sensor_readings with_caudal_impulses(Double caudal_impulses) {
    this.caudal_impulses = caudal_impulses;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sensor_readings)) {
      return false;
    }
    sensor_readings that = (sensor_readings) o;
    boolean equal = true;
    equal = equal && (this.index == null ? that.index == null : this.index.equals(that.index));
    equal = equal && (this.timestamp == null ? that.timestamp == null : this.timestamp.equals(that.timestamp));
    equal = equal && (this.tp2 == null ? that.tp2 == null : this.tp2.equals(that.tp2));
    equal = equal && (this.tp3 == null ? that.tp3 == null : this.tp3.equals(that.tp3));
    equal = equal && (this.h1 == null ? that.h1 == null : this.h1.equals(that.h1));
    equal = equal && (this.dv_pressure == null ? that.dv_pressure == null : this.dv_pressure.equals(that.dv_pressure));
    equal = equal && (this.reservoirs == null ? that.reservoirs == null : this.reservoirs.equals(that.reservoirs));
    equal = equal && (this.oil_temperature == null ? that.oil_temperature == null : this.oil_temperature.equals(that.oil_temperature));
    equal = equal && (this.motor_current == null ? that.motor_current == null : this.motor_current.equals(that.motor_current));
    equal = equal && (this.comp == null ? that.comp == null : this.comp.equals(that.comp));
    equal = equal && (this.dv_eletric == null ? that.dv_eletric == null : this.dv_eletric.equals(that.dv_eletric));
    equal = equal && (this.towers == null ? that.towers == null : this.towers.equals(that.towers));
    equal = equal && (this.mpg == null ? that.mpg == null : this.mpg.equals(that.mpg));
    equal = equal && (this.lps == null ? that.lps == null : this.lps.equals(that.lps));
    equal = equal && (this.pressure_switch == null ? that.pressure_switch == null : this.pressure_switch.equals(that.pressure_switch));
    equal = equal && (this.oil_level == null ? that.oil_level == null : this.oil_level.equals(that.oil_level));
    equal = equal && (this.caudal_impulses == null ? that.caudal_impulses == null : this.caudal_impulses.equals(that.caudal_impulses));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof sensor_readings)) {
      return false;
    }
    sensor_readings that = (sensor_readings) o;
    boolean equal = true;
    equal = equal && (this.index == null ? that.index == null : this.index.equals(that.index));
    equal = equal && (this.timestamp == null ? that.timestamp == null : this.timestamp.equals(that.timestamp));
    equal = equal && (this.tp2 == null ? that.tp2 == null : this.tp2.equals(that.tp2));
    equal = equal && (this.tp3 == null ? that.tp3 == null : this.tp3.equals(that.tp3));
    equal = equal && (this.h1 == null ? that.h1 == null : this.h1.equals(that.h1));
    equal = equal && (this.dv_pressure == null ? that.dv_pressure == null : this.dv_pressure.equals(that.dv_pressure));
    equal = equal && (this.reservoirs == null ? that.reservoirs == null : this.reservoirs.equals(that.reservoirs));
    equal = equal && (this.oil_temperature == null ? that.oil_temperature == null : this.oil_temperature.equals(that.oil_temperature));
    equal = equal && (this.motor_current == null ? that.motor_current == null : this.motor_current.equals(that.motor_current));
    equal = equal && (this.comp == null ? that.comp == null : this.comp.equals(that.comp));
    equal = equal && (this.dv_eletric == null ? that.dv_eletric == null : this.dv_eletric.equals(that.dv_eletric));
    equal = equal && (this.towers == null ? that.towers == null : this.towers.equals(that.towers));
    equal = equal && (this.mpg == null ? that.mpg == null : this.mpg.equals(that.mpg));
    equal = equal && (this.lps == null ? that.lps == null : this.lps.equals(that.lps));
    equal = equal && (this.pressure_switch == null ? that.pressure_switch == null : this.pressure_switch.equals(that.pressure_switch));
    equal = equal && (this.oil_level == null ? that.oil_level == null : this.oil_level.equals(that.oil_level));
    equal = equal && (this.caudal_impulses == null ? that.caudal_impulses == null : this.caudal_impulses.equals(that.caudal_impulses));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.index = JdbcWritableBridge.readInteger(1, __dbResults);
    this.timestamp = JdbcWritableBridge.readString(2, __dbResults);
    this.tp2 = JdbcWritableBridge.readDouble(3, __dbResults);
    this.tp3 = JdbcWritableBridge.readDouble(4, __dbResults);
    this.h1 = JdbcWritableBridge.readDouble(5, __dbResults);
    this.dv_pressure = JdbcWritableBridge.readDouble(6, __dbResults);
    this.reservoirs = JdbcWritableBridge.readDouble(7, __dbResults);
    this.oil_temperature = JdbcWritableBridge.readDouble(8, __dbResults);
    this.motor_current = JdbcWritableBridge.readDouble(9, __dbResults);
    this.comp = JdbcWritableBridge.readDouble(10, __dbResults);
    this.dv_eletric = JdbcWritableBridge.readDouble(11, __dbResults);
    this.towers = JdbcWritableBridge.readDouble(12, __dbResults);
    this.mpg = JdbcWritableBridge.readDouble(13, __dbResults);
    this.lps = JdbcWritableBridge.readDouble(14, __dbResults);
    this.pressure_switch = JdbcWritableBridge.readDouble(15, __dbResults);
    this.oil_level = JdbcWritableBridge.readDouble(16, __dbResults);
    this.caudal_impulses = JdbcWritableBridge.readDouble(17, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.index = JdbcWritableBridge.readInteger(1, __dbResults);
    this.timestamp = JdbcWritableBridge.readString(2, __dbResults);
    this.tp2 = JdbcWritableBridge.readDouble(3, __dbResults);
    this.tp3 = JdbcWritableBridge.readDouble(4, __dbResults);
    this.h1 = JdbcWritableBridge.readDouble(5, __dbResults);
    this.dv_pressure = JdbcWritableBridge.readDouble(6, __dbResults);
    this.reservoirs = JdbcWritableBridge.readDouble(7, __dbResults);
    this.oil_temperature = JdbcWritableBridge.readDouble(8, __dbResults);
    this.motor_current = JdbcWritableBridge.readDouble(9, __dbResults);
    this.comp = JdbcWritableBridge.readDouble(10, __dbResults);
    this.dv_eletric = JdbcWritableBridge.readDouble(11, __dbResults);
    this.towers = JdbcWritableBridge.readDouble(12, __dbResults);
    this.mpg = JdbcWritableBridge.readDouble(13, __dbResults);
    this.lps = JdbcWritableBridge.readDouble(14, __dbResults);
    this.pressure_switch = JdbcWritableBridge.readDouble(15, __dbResults);
    this.oil_level = JdbcWritableBridge.readDouble(16, __dbResults);
    this.caudal_impulses = JdbcWritableBridge.readDouble(17, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(index, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(timestamp, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(tp2, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(tp3, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(h1, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(dv_pressure, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(reservoirs, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(oil_temperature, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(motor_current, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(comp, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(dv_eletric, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(towers, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(mpg, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(lps, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(pressure_switch, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(oil_level, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(caudal_impulses, 17 + __off, 8, __dbStmt);
    return 17;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(index, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(timestamp, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(tp2, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(tp3, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(h1, 5 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(dv_pressure, 6 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(reservoirs, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(oil_temperature, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(motor_current, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(comp, 10 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(dv_eletric, 11 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(towers, 12 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(mpg, 13 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(lps, 14 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(pressure_switch, 15 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(oil_level, 16 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(caudal_impulses, 17 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.index = null;
    } else {
    this.index = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.timestamp = null;
    } else {
    this.timestamp = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.tp2 = null;
    } else {
    this.tp2 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.tp3 = null;
    } else {
    this.tp3 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.h1 = null;
    } else {
    this.h1 = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.dv_pressure = null;
    } else {
    this.dv_pressure = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.reservoirs = null;
    } else {
    this.reservoirs = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.oil_temperature = null;
    } else {
    this.oil_temperature = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.motor_current = null;
    } else {
    this.motor_current = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.comp = null;
    } else {
    this.comp = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.dv_eletric = null;
    } else {
    this.dv_eletric = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.towers = null;
    } else {
    this.towers = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.mpg = null;
    } else {
    this.mpg = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.lps = null;
    } else {
    this.lps = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.pressure_switch = null;
    } else {
    this.pressure_switch = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.oil_level = null;
    } else {
    this.oil_level = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.caudal_impulses = null;
    } else {
    this.caudal_impulses = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.index) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.index);
    }
    if (null == this.timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, timestamp);
    }
    if (null == this.tp2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.tp2);
    }
    if (null == this.tp3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.tp3);
    }
    if (null == this.h1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.h1);
    }
    if (null == this.dv_pressure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dv_pressure);
    }
    if (null == this.reservoirs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.reservoirs);
    }
    if (null == this.oil_temperature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.oil_temperature);
    }
    if (null == this.motor_current) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.motor_current);
    }
    if (null == this.comp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.comp);
    }
    if (null == this.dv_eletric) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dv_eletric);
    }
    if (null == this.towers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.towers);
    }
    if (null == this.mpg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.mpg);
    }
    if (null == this.lps) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.lps);
    }
    if (null == this.pressure_switch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.pressure_switch);
    }
    if (null == this.oil_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.oil_level);
    }
    if (null == this.caudal_impulses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.caudal_impulses);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.index) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.index);
    }
    if (null == this.timestamp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, timestamp);
    }
    if (null == this.tp2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.tp2);
    }
    if (null == this.tp3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.tp3);
    }
    if (null == this.h1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.h1);
    }
    if (null == this.dv_pressure) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dv_pressure);
    }
    if (null == this.reservoirs) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.reservoirs);
    }
    if (null == this.oil_temperature) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.oil_temperature);
    }
    if (null == this.motor_current) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.motor_current);
    }
    if (null == this.comp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.comp);
    }
    if (null == this.dv_eletric) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.dv_eletric);
    }
    if (null == this.towers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.towers);
    }
    if (null == this.mpg) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.mpg);
    }
    if (null == this.lps) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.lps);
    }
    if (null == this.pressure_switch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.pressure_switch);
    }
    if (null == this.oil_level) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.oil_level);
    }
    if (null == this.caudal_impulses) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.caudal_impulses);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(index==null?"null":"" + index, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(timestamp==null?"null":timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tp2==null?"null":"" + tp2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tp3==null?"null":"" + tp3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(h1==null?"null":"" + h1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dv_pressure==null?"null":"" + dv_pressure, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reservoirs==null?"null":"" + reservoirs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(oil_temperature==null?"null":"" + oil_temperature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(motor_current==null?"null":"" + motor_current, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comp==null?"null":"" + comp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dv_eletric==null?"null":"" + dv_eletric, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(towers==null?"null":"" + towers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mpg==null?"null":"" + mpg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lps==null?"null":"" + lps, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pressure_switch==null?"null":"" + pressure_switch, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(oil_level==null?"null":"" + oil_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caudal_impulses==null?"null":"" + caudal_impulses, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(index==null?"null":"" + index, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(timestamp==null?"null":timestamp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tp2==null?"null":"" + tp2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tp3==null?"null":"" + tp3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(h1==null?"null":"" + h1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dv_pressure==null?"null":"" + dv_pressure, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(reservoirs==null?"null":"" + reservoirs, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(oil_temperature==null?"null":"" + oil_temperature, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(motor_current==null?"null":"" + motor_current, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comp==null?"null":"" + comp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dv_eletric==null?"null":"" + dv_eletric, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(towers==null?"null":"" + towers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(mpg==null?"null":"" + mpg, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(lps==null?"null":"" + lps, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pressure_switch==null?"null":"" + pressure_switch, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(oil_level==null?"null":"" + oil_level, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(caudal_impulses==null?"null":"" + caudal_impulses, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.index = null; } else {
      this.index = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.timestamp = null; } else {
      this.timestamp = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tp2 = null; } else {
      this.tp2 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tp3 = null; } else {
      this.tp3 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.h1 = null; } else {
      this.h1 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dv_pressure = null; } else {
      this.dv_pressure = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reservoirs = null; } else {
      this.reservoirs = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.oil_temperature = null; } else {
      this.oil_temperature = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.motor_current = null; } else {
      this.motor_current = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.comp = null; } else {
      this.comp = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dv_eletric = null; } else {
      this.dv_eletric = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.towers = null; } else {
      this.towers = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mpg = null; } else {
      this.mpg = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lps = null; } else {
      this.lps = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pressure_switch = null; } else {
      this.pressure_switch = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.oil_level = null; } else {
      this.oil_level = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.caudal_impulses = null; } else {
      this.caudal_impulses = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.index = null; } else {
      this.index = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.timestamp = null; } else {
      this.timestamp = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tp2 = null; } else {
      this.tp2 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tp3 = null; } else {
      this.tp3 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.h1 = null; } else {
      this.h1 = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dv_pressure = null; } else {
      this.dv_pressure = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.reservoirs = null; } else {
      this.reservoirs = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.oil_temperature = null; } else {
      this.oil_temperature = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.motor_current = null; } else {
      this.motor_current = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.comp = null; } else {
      this.comp = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dv_eletric = null; } else {
      this.dv_eletric = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.towers = null; } else {
      this.towers = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.mpg = null; } else {
      this.mpg = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.lps = null; } else {
      this.lps = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pressure_switch = null; } else {
      this.pressure_switch = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.oil_level = null; } else {
      this.oil_level = Double.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.caudal_impulses = null; } else {
      this.caudal_impulses = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    sensor_readings o = (sensor_readings) super.clone();
    return o;
  }

  public void clone0(sensor_readings o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("index", this.index);
    __sqoop$field_map.put("timestamp", this.timestamp);
    __sqoop$field_map.put("tp2", this.tp2);
    __sqoop$field_map.put("tp3", this.tp3);
    __sqoop$field_map.put("h1", this.h1);
    __sqoop$field_map.put("dv_pressure", this.dv_pressure);
    __sqoop$field_map.put("reservoirs", this.reservoirs);
    __sqoop$field_map.put("oil_temperature", this.oil_temperature);
    __sqoop$field_map.put("motor_current", this.motor_current);
    __sqoop$field_map.put("comp", this.comp);
    __sqoop$field_map.put("dv_eletric", this.dv_eletric);
    __sqoop$field_map.put("towers", this.towers);
    __sqoop$field_map.put("mpg", this.mpg);
    __sqoop$field_map.put("lps", this.lps);
    __sqoop$field_map.put("pressure_switch", this.pressure_switch);
    __sqoop$field_map.put("oil_level", this.oil_level);
    __sqoop$field_map.put("caudal_impulses", this.caudal_impulses);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("index", this.index);
    __sqoop$field_map.put("timestamp", this.timestamp);
    __sqoop$field_map.put("tp2", this.tp2);
    __sqoop$field_map.put("tp3", this.tp3);
    __sqoop$field_map.put("h1", this.h1);
    __sqoop$field_map.put("dv_pressure", this.dv_pressure);
    __sqoop$field_map.put("reservoirs", this.reservoirs);
    __sqoop$field_map.put("oil_temperature", this.oil_temperature);
    __sqoop$field_map.put("motor_current", this.motor_current);
    __sqoop$field_map.put("comp", this.comp);
    __sqoop$field_map.put("dv_eletric", this.dv_eletric);
    __sqoop$field_map.put("towers", this.towers);
    __sqoop$field_map.put("mpg", this.mpg);
    __sqoop$field_map.put("lps", this.lps);
    __sqoop$field_map.put("pressure_switch", this.pressure_switch);
    __sqoop$field_map.put("oil_level", this.oil_level);
    __sqoop$field_map.put("caudal_impulses", this.caudal_impulses);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
