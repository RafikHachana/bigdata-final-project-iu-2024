// ORM class for table 'apu_failures'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Tue May 07 11:44:45 MSK 2024
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

public class apu_failures extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("event_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        apu_failures.this.event_id = (Integer)value;
      }
    });
    setters.put("start_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        apu_failures.this.start_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("end_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        apu_failures.this.end_time = (java.sql.Timestamp)value;
      }
    });
    setters.put("duration_minutes", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        apu_failures.this.duration_minutes = (Integer)value;
      }
    });
    setters.put("severity", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        apu_failures.this.severity = (String)value;
      }
    });
  }
  public apu_failures() {
    init0();
  }
  private Integer event_id;
  public Integer get_event_id() {
    return event_id;
  }
  public void set_event_id(Integer event_id) {
    this.event_id = event_id;
  }
  public apu_failures with_event_id(Integer event_id) {
    this.event_id = event_id;
    return this;
  }
  private java.sql.Timestamp start_time;
  public java.sql.Timestamp get_start_time() {
    return start_time;
  }
  public void set_start_time(java.sql.Timestamp start_time) {
    this.start_time = start_time;
  }
  public apu_failures with_start_time(java.sql.Timestamp start_time) {
    this.start_time = start_time;
    return this;
  }
  private java.sql.Timestamp end_time;
  public java.sql.Timestamp get_end_time() {
    return end_time;
  }
  public void set_end_time(java.sql.Timestamp end_time) {
    this.end_time = end_time;
  }
  public apu_failures with_end_time(java.sql.Timestamp end_time) {
    this.end_time = end_time;
    return this;
  }
  private Integer duration_minutes;
  public Integer get_duration_minutes() {
    return duration_minutes;
  }
  public void set_duration_minutes(Integer duration_minutes) {
    this.duration_minutes = duration_minutes;
  }
  public apu_failures with_duration_minutes(Integer duration_minutes) {
    this.duration_minutes = duration_minutes;
    return this;
  }
  private String severity;
  public String get_severity() {
    return severity;
  }
  public void set_severity(String severity) {
    this.severity = severity;
  }
  public apu_failures with_severity(String severity) {
    this.severity = severity;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof apu_failures)) {
      return false;
    }
    apu_failures that = (apu_failures) o;
    boolean equal = true;
    equal = equal && (this.event_id == null ? that.event_id == null : this.event_id.equals(that.event_id));
    equal = equal && (this.start_time == null ? that.start_time == null : this.start_time.equals(that.start_time));
    equal = equal && (this.end_time == null ? that.end_time == null : this.end_time.equals(that.end_time));
    equal = equal && (this.duration_minutes == null ? that.duration_minutes == null : this.duration_minutes.equals(that.duration_minutes));
    equal = equal && (this.severity == null ? that.severity == null : this.severity.equals(that.severity));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof apu_failures)) {
      return false;
    }
    apu_failures that = (apu_failures) o;
    boolean equal = true;
    equal = equal && (this.event_id == null ? that.event_id == null : this.event_id.equals(that.event_id));
    equal = equal && (this.start_time == null ? that.start_time == null : this.start_time.equals(that.start_time));
    equal = equal && (this.end_time == null ? that.end_time == null : this.end_time.equals(that.end_time));
    equal = equal && (this.duration_minutes == null ? that.duration_minutes == null : this.duration_minutes.equals(that.duration_minutes));
    equal = equal && (this.severity == null ? that.severity == null : this.severity.equals(that.severity));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.event_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.start_time = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.end_time = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.duration_minutes = JdbcWritableBridge.readInteger(4, __dbResults);
    this.severity = JdbcWritableBridge.readString(5, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.event_id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.start_time = JdbcWritableBridge.readTimestamp(2, __dbResults);
    this.end_time = JdbcWritableBridge.readTimestamp(3, __dbResults);
    this.duration_minutes = JdbcWritableBridge.readInteger(4, __dbResults);
    this.severity = JdbcWritableBridge.readString(5, __dbResults);
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
    JdbcWritableBridge.writeInteger(event_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_time, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_time, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(duration_minutes, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(severity, 5 + __off, 12, __dbStmt);
    return 5;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(event_id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeTimestamp(start_time, 2 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(end_time, 3 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeInteger(duration_minutes, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(severity, 5 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.event_id = null;
    } else {
    this.event_id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.start_time = null;
    } else {
    this.start_time = new Timestamp(__dataIn.readLong());
    this.start_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.end_time = null;
    } else {
    this.end_time = new Timestamp(__dataIn.readLong());
    this.end_time.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.duration_minutes = null;
    } else {
    this.duration_minutes = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.severity = null;
    } else {
    this.severity = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.event_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.event_id);
    }
    if (null == this.start_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_time.getTime());
    __dataOut.writeInt(this.start_time.getNanos());
    }
    if (null == this.end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time.getTime());
    __dataOut.writeInt(this.end_time.getNanos());
    }
    if (null == this.duration_minutes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.duration_minutes);
    }
    if (null == this.severity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, severity);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.event_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.event_id);
    }
    if (null == this.start_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.start_time.getTime());
    __dataOut.writeInt(this.start_time.getNanos());
    }
    if (null == this.end_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.end_time.getTime());
    __dataOut.writeInt(this.end_time.getNanos());
    }
    if (null == this.duration_minutes) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.duration_minutes);
    }
    if (null == this.severity) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, severity);
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
    __sb.append(FieldFormatter.escapeAndEnclose(event_id==null?"null":"" + event_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time==null?"null":"" + start_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time==null?"null":"" + end_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_minutes==null?"null":"" + duration_minutes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(severity==null?"null":severity, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(event_id==null?"null":"" + event_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(start_time==null?"null":"" + start_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(end_time==null?"null":"" + end_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(duration_minutes==null?"null":"" + duration_minutes, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(severity==null?"null":severity, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.event_id = null; } else {
      this.event_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_time = null; } else {
      this.start_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time = null; } else {
      this.end_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.duration_minutes = null; } else {
      this.duration_minutes = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.severity = null; } else {
      this.severity = __cur_str;
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.event_id = null; } else {
      this.event_id = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.start_time = null; } else {
      this.start_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.end_time = null; } else {
      this.end_time = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.duration_minutes = null; } else {
      this.duration_minutes = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.severity = null; } else {
      this.severity = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    apu_failures o = (apu_failures) super.clone();
    o.start_time = (o.start_time != null) ? (java.sql.Timestamp) o.start_time.clone() : null;
    o.end_time = (o.end_time != null) ? (java.sql.Timestamp) o.end_time.clone() : null;
    return o;
  }

  public void clone0(apu_failures o) throws CloneNotSupportedException {
    o.start_time = (o.start_time != null) ? (java.sql.Timestamp) o.start_time.clone() : null;
    o.end_time = (o.end_time != null) ? (java.sql.Timestamp) o.end_time.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("event_id", this.event_id);
    __sqoop$field_map.put("start_time", this.start_time);
    __sqoop$field_map.put("end_time", this.end_time);
    __sqoop$field_map.put("duration_minutes", this.duration_minutes);
    __sqoop$field_map.put("severity", this.severity);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("event_id", this.event_id);
    __sqoop$field_map.put("start_time", this.start_time);
    __sqoop$field_map.put("end_time", this.end_time);
    __sqoop$field_map.put("duration_minutes", this.duration_minutes);
    __sqoop$field_map.put("severity", this.severity);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
