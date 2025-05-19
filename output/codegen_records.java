// ORM class for table 'records'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sun May 18 21:08:36 MSK 2025
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

public class codegen_records extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("host_since", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.host_since = (java.sql.Date)value;
      }
    });
    setters.put("host_response_time", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.host_response_time = (String)value;
      }
    });
    setters.put("host_response_rate", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.host_response_rate = (Integer)value;
      }
    });
    setters.put("host_is_superhost", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.host_is_superhost = (Boolean)value;
      }
    });
    setters.put("host_has_profile_pic", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.host_has_profile_pic = (Boolean)value;
      }
    });
    setters.put("host_identity_verified", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.host_identity_verified = (Boolean)value;
      }
    });
    setters.put("neighbourhood", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.neighbourhood = (String)value;
      }
    });
    setters.put("latitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.latitude = (Float)value;
      }
    });
    setters.put("longitude", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.longitude = (Float)value;
      }
    });
    setters.put("property_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.property_type = (String)value;
      }
    });
    setters.put("room_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.room_type = (String)value;
      }
    });
    setters.put("accommodates", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.accommodates = (Integer)value;
      }
    });
    setters.put("bathrooms", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.bathrooms = (Float)value;
      }
    });
    setters.put("bedrooms", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.bedrooms = (Integer)value;
      }
    });
    setters.put("beds", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.beds = (Integer)value;
      }
    });
    setters.put("bed_type", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.bed_type = (String)value;
      }
    });
    setters.put("amenities", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.amenities = (String)value;
      }
    });
    setters.put("price", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.price = (Float)value;
      }
    });
    setters.put("security_deposit", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.security_deposit = (Float)value;
      }
    });
    setters.put("cleaning_fee", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.cleaning_fee = (Float)value;
      }
    });
    setters.put("guests_included", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.guests_included = (Integer)value;
      }
    });
    setters.put("extra_people", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.extra_people = (Float)value;
      }
    });
    setters.put("minimum_nights", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.minimum_nights = (Integer)value;
      }
    });
    setters.put("maximum_nights", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.maximum_nights = (Integer)value;
      }
    });
    setters.put("review_scores_rating", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.review_scores_rating = (Float)value;
      }
    });
    setters.put("instant_bookable", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.instant_bookable = (Boolean)value;
      }
    });
    setters.put("cancellation_policy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.cancellation_policy = (String)value;
      }
    });
    setters.put("require_guest_profile_picture", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.require_guest_profile_picture = (Boolean)value;
      }
    });
    setters.put("month", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.month = (String)value;
      }
    });
    setters.put("kitchen", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.kitchen = (Boolean)value;
      }
    });
    setters.put("wifi", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.wifi = (Boolean)value;
      }
    });
    setters.put("essentials", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.essentials = (Boolean)value;
      }
    });
    setters.put("tv", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.tv = (Boolean)value;
      }
    });
    setters.put("air_conditioning", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.air_conditioning = (Boolean)value;
      }
    });
    setters.put("elevator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.elevator = (Boolean)value;
      }
    });
    setters.put("washer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.washer = (Boolean)value;
      }
    });
    setters.put("hangers", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.hangers = (Boolean)value;
      }
    });
    setters.put("iron", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.iron = (Boolean)value;
      }
    });
    setters.put("laptop_friendly_workspace", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.laptop_friendly_workspace = (Boolean)value;
      }
    });
    setters.put("family_kid_friendly", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.family_kid_friendly = (Boolean)value;
      }
    });
    setters.put("hot_water", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.hot_water = (Boolean)value;
      }
    });
    setters.put("cable_tv", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.cable_tv = (Boolean)value;
      }
    });
    setters.put("free_parking_on_premises", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.free_parking_on_premises = (Boolean)value;
      }
    });
    setters.put("hair_dryer", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.hair_dryer = (Boolean)value;
      }
    });
    setters.put("smoking_allowed", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.smoking_allowed = (Boolean)value;
      }
    });
    setters.put("doorman", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.doorman = (Boolean)value;
      }
    });
    setters.put("dishes_and_silverware", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.dishes_and_silverware = (Boolean)value;
      }
    });
    setters.put("buzzer_wireless_intercom", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.buzzer_wireless_intercom = (Boolean)value;
      }
    });
    setters.put("refrigerator", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        codegen_records.this.refrigerator = (Boolean)value;
      }
    });
  }
  public codegen_records() {
    init0();
  }
  private java.sql.Date host_since;
  public java.sql.Date get_host_since() {
    return host_since;
  }
  public void set_host_since(java.sql.Date host_since) {
    this.host_since = host_since;
  }
  public codegen_records with_host_since(java.sql.Date host_since) {
    this.host_since = host_since;
    return this;
  }
  private String host_response_time;
  public String get_host_response_time() {
    return host_response_time;
  }
  public void set_host_response_time(String host_response_time) {
    this.host_response_time = host_response_time;
  }
  public codegen_records with_host_response_time(String host_response_time) {
    this.host_response_time = host_response_time;
    return this;
  }
  private Integer host_response_rate;
  public Integer get_host_response_rate() {
    return host_response_rate;
  }
  public void set_host_response_rate(Integer host_response_rate) {
    this.host_response_rate = host_response_rate;
  }
  public codegen_records with_host_response_rate(Integer host_response_rate) {
    this.host_response_rate = host_response_rate;
    return this;
  }
  private Boolean host_is_superhost;
  public Boolean get_host_is_superhost() {
    return host_is_superhost;
  }
  public void set_host_is_superhost(Boolean host_is_superhost) {
    this.host_is_superhost = host_is_superhost;
  }
  public codegen_records with_host_is_superhost(Boolean host_is_superhost) {
    this.host_is_superhost = host_is_superhost;
    return this;
  }
  private Boolean host_has_profile_pic;
  public Boolean get_host_has_profile_pic() {
    return host_has_profile_pic;
  }
  public void set_host_has_profile_pic(Boolean host_has_profile_pic) {
    this.host_has_profile_pic = host_has_profile_pic;
  }
  public codegen_records with_host_has_profile_pic(Boolean host_has_profile_pic) {
    this.host_has_profile_pic = host_has_profile_pic;
    return this;
  }
  private Boolean host_identity_verified;
  public Boolean get_host_identity_verified() {
    return host_identity_verified;
  }
  public void set_host_identity_verified(Boolean host_identity_verified) {
    this.host_identity_verified = host_identity_verified;
  }
  public codegen_records with_host_identity_verified(Boolean host_identity_verified) {
    this.host_identity_verified = host_identity_verified;
    return this;
  }
  private String neighbourhood;
  public String get_neighbourhood() {
    return neighbourhood;
  }
  public void set_neighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
  }
  public codegen_records with_neighbourhood(String neighbourhood) {
    this.neighbourhood = neighbourhood;
    return this;
  }
  private Float latitude;
  public Float get_latitude() {
    return latitude;
  }
  public void set_latitude(Float latitude) {
    this.latitude = latitude;
  }
  public codegen_records with_latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }
  private Float longitude;
  public Float get_longitude() {
    return longitude;
  }
  public void set_longitude(Float longitude) {
    this.longitude = longitude;
  }
  public codegen_records with_longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }
  private String property_type;
  public String get_property_type() {
    return property_type;
  }
  public void set_property_type(String property_type) {
    this.property_type = property_type;
  }
  public codegen_records with_property_type(String property_type) {
    this.property_type = property_type;
    return this;
  }
  private String room_type;
  public String get_room_type() {
    return room_type;
  }
  public void set_room_type(String room_type) {
    this.room_type = room_type;
  }
  public codegen_records with_room_type(String room_type) {
    this.room_type = room_type;
    return this;
  }
  private Integer accommodates;
  public Integer get_accommodates() {
    return accommodates;
  }
  public void set_accommodates(Integer accommodates) {
    this.accommodates = accommodates;
  }
  public codegen_records with_accommodates(Integer accommodates) {
    this.accommodates = accommodates;
    return this;
  }
  private Float bathrooms;
  public Float get_bathrooms() {
    return bathrooms;
  }
  public void set_bathrooms(Float bathrooms) {
    this.bathrooms = bathrooms;
  }
  public codegen_records with_bathrooms(Float bathrooms) {
    this.bathrooms = bathrooms;
    return this;
  }
  private Integer bedrooms;
  public Integer get_bedrooms() {
    return bedrooms;
  }
  public void set_bedrooms(Integer bedrooms) {
    this.bedrooms = bedrooms;
  }
  public codegen_records with_bedrooms(Integer bedrooms) {
    this.bedrooms = bedrooms;
    return this;
  }
  private Integer beds;
  public Integer get_beds() {
    return beds;
  }
  public void set_beds(Integer beds) {
    this.beds = beds;
  }
  public codegen_records with_beds(Integer beds) {
    this.beds = beds;
    return this;
  }
  private String bed_type;
  public String get_bed_type() {
    return bed_type;
  }
  public void set_bed_type(String bed_type) {
    this.bed_type = bed_type;
  }
  public codegen_records with_bed_type(String bed_type) {
    this.bed_type = bed_type;
    return this;
  }
  private String amenities;
  public String get_amenities() {
    return amenities;
  }
  public void set_amenities(String amenities) {
    this.amenities = amenities;
  }
  public codegen_records with_amenities(String amenities) {
    this.amenities = amenities;
    return this;
  }
  private Float price;
  public Float get_price() {
    return price;
  }
  public void set_price(Float price) {
    this.price = price;
  }
  public codegen_records with_price(Float price) {
    this.price = price;
    return this;
  }
  private Float security_deposit;
  public Float get_security_deposit() {
    return security_deposit;
  }
  public void set_security_deposit(Float security_deposit) {
    this.security_deposit = security_deposit;
  }
  public codegen_records with_security_deposit(Float security_deposit) {
    this.security_deposit = security_deposit;
    return this;
  }
  private Float cleaning_fee;
  public Float get_cleaning_fee() {
    return cleaning_fee;
  }
  public void set_cleaning_fee(Float cleaning_fee) {
    this.cleaning_fee = cleaning_fee;
  }
  public codegen_records with_cleaning_fee(Float cleaning_fee) {
    this.cleaning_fee = cleaning_fee;
    return this;
  }
  private Integer guests_included;
  public Integer get_guests_included() {
    return guests_included;
  }
  public void set_guests_included(Integer guests_included) {
    this.guests_included = guests_included;
  }
  public codegen_records with_guests_included(Integer guests_included) {
    this.guests_included = guests_included;
    return this;
  }
  private Float extra_people;
  public Float get_extra_people() {
    return extra_people;
  }
  public void set_extra_people(Float extra_people) {
    this.extra_people = extra_people;
  }
  public codegen_records with_extra_people(Float extra_people) {
    this.extra_people = extra_people;
    return this;
  }
  private Integer minimum_nights;
  public Integer get_minimum_nights() {
    return minimum_nights;
  }
  public void set_minimum_nights(Integer minimum_nights) {
    this.minimum_nights = minimum_nights;
  }
  public codegen_records with_minimum_nights(Integer minimum_nights) {
    this.minimum_nights = minimum_nights;
    return this;
  }
  private Integer maximum_nights;
  public Integer get_maximum_nights() {
    return maximum_nights;
  }
  public void set_maximum_nights(Integer maximum_nights) {
    this.maximum_nights = maximum_nights;
  }
  public codegen_records with_maximum_nights(Integer maximum_nights) {
    this.maximum_nights = maximum_nights;
    return this;
  }
  private Float review_scores_rating;
  public Float get_review_scores_rating() {
    return review_scores_rating;
  }
  public void set_review_scores_rating(Float review_scores_rating) {
    this.review_scores_rating = review_scores_rating;
  }
  public codegen_records with_review_scores_rating(Float review_scores_rating) {
    this.review_scores_rating = review_scores_rating;
    return this;
  }
  private Boolean instant_bookable;
  public Boolean get_instant_bookable() {
    return instant_bookable;
  }
  public void set_instant_bookable(Boolean instant_bookable) {
    this.instant_bookable = instant_bookable;
  }
  public codegen_records with_instant_bookable(Boolean instant_bookable) {
    this.instant_bookable = instant_bookable;
    return this;
  }
  private String cancellation_policy;
  public String get_cancellation_policy() {
    return cancellation_policy;
  }
  public void set_cancellation_policy(String cancellation_policy) {
    this.cancellation_policy = cancellation_policy;
  }
  public codegen_records with_cancellation_policy(String cancellation_policy) {
    this.cancellation_policy = cancellation_policy;
    return this;
  }
  private Boolean require_guest_profile_picture;
  public Boolean get_require_guest_profile_picture() {
    return require_guest_profile_picture;
  }
  public void set_require_guest_profile_picture(Boolean require_guest_profile_picture) {
    this.require_guest_profile_picture = require_guest_profile_picture;
  }
  public codegen_records with_require_guest_profile_picture(Boolean require_guest_profile_picture) {
    this.require_guest_profile_picture = require_guest_profile_picture;
    return this;
  }
  private String month;
  public String get_month() {
    return month;
  }
  public void set_month(String month) {
    this.month = month;
  }
  public codegen_records with_month(String month) {
    this.month = month;
    return this;
  }
  private Boolean kitchen;
  public Boolean get_kitchen() {
    return kitchen;
  }
  public void set_kitchen(Boolean kitchen) {
    this.kitchen = kitchen;
  }
  public codegen_records with_kitchen(Boolean kitchen) {
    this.kitchen = kitchen;
    return this;
  }
  private Boolean wifi;
  public Boolean get_wifi() {
    return wifi;
  }
  public void set_wifi(Boolean wifi) {
    this.wifi = wifi;
  }
  public codegen_records with_wifi(Boolean wifi) {
    this.wifi = wifi;
    return this;
  }
  private Boolean essentials;
  public Boolean get_essentials() {
    return essentials;
  }
  public void set_essentials(Boolean essentials) {
    this.essentials = essentials;
  }
  public codegen_records with_essentials(Boolean essentials) {
    this.essentials = essentials;
    return this;
  }
  private Boolean tv;
  public Boolean get_tv() {
    return tv;
  }
  public void set_tv(Boolean tv) {
    this.tv = tv;
  }
  public codegen_records with_tv(Boolean tv) {
    this.tv = tv;
    return this;
  }
  private Boolean air_conditioning;
  public Boolean get_air_conditioning() {
    return air_conditioning;
  }
  public void set_air_conditioning(Boolean air_conditioning) {
    this.air_conditioning = air_conditioning;
  }
  public codegen_records with_air_conditioning(Boolean air_conditioning) {
    this.air_conditioning = air_conditioning;
    return this;
  }
  private Boolean elevator;
  public Boolean get_elevator() {
    return elevator;
  }
  public void set_elevator(Boolean elevator) {
    this.elevator = elevator;
  }
  public codegen_records with_elevator(Boolean elevator) {
    this.elevator = elevator;
    return this;
  }
  private Boolean washer;
  public Boolean get_washer() {
    return washer;
  }
  public void set_washer(Boolean washer) {
    this.washer = washer;
  }
  public codegen_records with_washer(Boolean washer) {
    this.washer = washer;
    return this;
  }
  private Boolean hangers;
  public Boolean get_hangers() {
    return hangers;
  }
  public void set_hangers(Boolean hangers) {
    this.hangers = hangers;
  }
  public codegen_records with_hangers(Boolean hangers) {
    this.hangers = hangers;
    return this;
  }
  private Boolean iron;
  public Boolean get_iron() {
    return iron;
  }
  public void set_iron(Boolean iron) {
    this.iron = iron;
  }
  public codegen_records with_iron(Boolean iron) {
    this.iron = iron;
    return this;
  }
  private Boolean laptop_friendly_workspace;
  public Boolean get_laptop_friendly_workspace() {
    return laptop_friendly_workspace;
  }
  public void set_laptop_friendly_workspace(Boolean laptop_friendly_workspace) {
    this.laptop_friendly_workspace = laptop_friendly_workspace;
  }
  public codegen_records with_laptop_friendly_workspace(Boolean laptop_friendly_workspace) {
    this.laptop_friendly_workspace = laptop_friendly_workspace;
    return this;
  }
  private Boolean family_kid_friendly;
  public Boolean get_family_kid_friendly() {
    return family_kid_friendly;
  }
  public void set_family_kid_friendly(Boolean family_kid_friendly) {
    this.family_kid_friendly = family_kid_friendly;
  }
  public codegen_records with_family_kid_friendly(Boolean family_kid_friendly) {
    this.family_kid_friendly = family_kid_friendly;
    return this;
  }
  private Boolean hot_water;
  public Boolean get_hot_water() {
    return hot_water;
  }
  public void set_hot_water(Boolean hot_water) {
    this.hot_water = hot_water;
  }
  public codegen_records with_hot_water(Boolean hot_water) {
    this.hot_water = hot_water;
    return this;
  }
  private Boolean cable_tv;
  public Boolean get_cable_tv() {
    return cable_tv;
  }
  public void set_cable_tv(Boolean cable_tv) {
    this.cable_tv = cable_tv;
  }
  public codegen_records with_cable_tv(Boolean cable_tv) {
    this.cable_tv = cable_tv;
    return this;
  }
  private Boolean free_parking_on_premises;
  public Boolean get_free_parking_on_premises() {
    return free_parking_on_premises;
  }
  public void set_free_parking_on_premises(Boolean free_parking_on_premises) {
    this.free_parking_on_premises = free_parking_on_premises;
  }
  public codegen_records with_free_parking_on_premises(Boolean free_parking_on_premises) {
    this.free_parking_on_premises = free_parking_on_premises;
    return this;
  }
  private Boolean hair_dryer;
  public Boolean get_hair_dryer() {
    return hair_dryer;
  }
  public void set_hair_dryer(Boolean hair_dryer) {
    this.hair_dryer = hair_dryer;
  }
  public codegen_records with_hair_dryer(Boolean hair_dryer) {
    this.hair_dryer = hair_dryer;
    return this;
  }
  private Boolean smoking_allowed;
  public Boolean get_smoking_allowed() {
    return smoking_allowed;
  }
  public void set_smoking_allowed(Boolean smoking_allowed) {
    this.smoking_allowed = smoking_allowed;
  }
  public codegen_records with_smoking_allowed(Boolean smoking_allowed) {
    this.smoking_allowed = smoking_allowed;
    return this;
  }
  private Boolean doorman;
  public Boolean get_doorman() {
    return doorman;
  }
  public void set_doorman(Boolean doorman) {
    this.doorman = doorman;
  }
  public codegen_records with_doorman(Boolean doorman) {
    this.doorman = doorman;
    return this;
  }
  private Boolean dishes_and_silverware;
  public Boolean get_dishes_and_silverware() {
    return dishes_and_silverware;
  }
  public void set_dishes_and_silverware(Boolean dishes_and_silverware) {
    this.dishes_and_silverware = dishes_and_silverware;
  }
  public codegen_records with_dishes_and_silverware(Boolean dishes_and_silverware) {
    this.dishes_and_silverware = dishes_and_silverware;
    return this;
  }
  private Boolean buzzer_wireless_intercom;
  public Boolean get_buzzer_wireless_intercom() {
    return buzzer_wireless_intercom;
  }
  public void set_buzzer_wireless_intercom(Boolean buzzer_wireless_intercom) {
    this.buzzer_wireless_intercom = buzzer_wireless_intercom;
  }
  public codegen_records with_buzzer_wireless_intercom(Boolean buzzer_wireless_intercom) {
    this.buzzer_wireless_intercom = buzzer_wireless_intercom;
    return this;
  }
  private Boolean refrigerator;
  public Boolean get_refrigerator() {
    return refrigerator;
  }
  public void set_refrigerator(Boolean refrigerator) {
    this.refrigerator = refrigerator;
  }
  public codegen_records with_refrigerator(Boolean refrigerator) {
    this.refrigerator = refrigerator;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_records)) {
      return false;
    }
    codegen_records that = (codegen_records) o;
    boolean equal = true;
    equal = equal && (this.host_since == null ? that.host_since == null : this.host_since.equals(that.host_since));
    equal = equal && (this.host_response_time == null ? that.host_response_time == null : this.host_response_time.equals(that.host_response_time));
    equal = equal && (this.host_response_rate == null ? that.host_response_rate == null : this.host_response_rate.equals(that.host_response_rate));
    equal = equal && (this.host_is_superhost == null ? that.host_is_superhost == null : this.host_is_superhost.equals(that.host_is_superhost));
    equal = equal && (this.host_has_profile_pic == null ? that.host_has_profile_pic == null : this.host_has_profile_pic.equals(that.host_has_profile_pic));
    equal = equal && (this.host_identity_verified == null ? that.host_identity_verified == null : this.host_identity_verified.equals(that.host_identity_verified));
    equal = equal && (this.neighbourhood == null ? that.neighbourhood == null : this.neighbourhood.equals(that.neighbourhood));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.property_type == null ? that.property_type == null : this.property_type.equals(that.property_type));
    equal = equal && (this.room_type == null ? that.room_type == null : this.room_type.equals(that.room_type));
    equal = equal && (this.accommodates == null ? that.accommodates == null : this.accommodates.equals(that.accommodates));
    equal = equal && (this.bathrooms == null ? that.bathrooms == null : this.bathrooms.equals(that.bathrooms));
    equal = equal && (this.bedrooms == null ? that.bedrooms == null : this.bedrooms.equals(that.bedrooms));
    equal = equal && (this.beds == null ? that.beds == null : this.beds.equals(that.beds));
    equal = equal && (this.bed_type == null ? that.bed_type == null : this.bed_type.equals(that.bed_type));
    equal = equal && (this.amenities == null ? that.amenities == null : this.amenities.equals(that.amenities));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.security_deposit == null ? that.security_deposit == null : this.security_deposit.equals(that.security_deposit));
    equal = equal && (this.cleaning_fee == null ? that.cleaning_fee == null : this.cleaning_fee.equals(that.cleaning_fee));
    equal = equal && (this.guests_included == null ? that.guests_included == null : this.guests_included.equals(that.guests_included));
    equal = equal && (this.extra_people == null ? that.extra_people == null : this.extra_people.equals(that.extra_people));
    equal = equal && (this.minimum_nights == null ? that.minimum_nights == null : this.minimum_nights.equals(that.minimum_nights));
    equal = equal && (this.maximum_nights == null ? that.maximum_nights == null : this.maximum_nights.equals(that.maximum_nights));
    equal = equal && (this.review_scores_rating == null ? that.review_scores_rating == null : this.review_scores_rating.equals(that.review_scores_rating));
    equal = equal && (this.instant_bookable == null ? that.instant_bookable == null : this.instant_bookable.equals(that.instant_bookable));
    equal = equal && (this.cancellation_policy == null ? that.cancellation_policy == null : this.cancellation_policy.equals(that.cancellation_policy));
    equal = equal && (this.require_guest_profile_picture == null ? that.require_guest_profile_picture == null : this.require_guest_profile_picture.equals(that.require_guest_profile_picture));
    equal = equal && (this.month == null ? that.month == null : this.month.equals(that.month));
    equal = equal && (this.kitchen == null ? that.kitchen == null : this.kitchen.equals(that.kitchen));
    equal = equal && (this.wifi == null ? that.wifi == null : this.wifi.equals(that.wifi));
    equal = equal && (this.essentials == null ? that.essentials == null : this.essentials.equals(that.essentials));
    equal = equal && (this.tv == null ? that.tv == null : this.tv.equals(that.tv));
    equal = equal && (this.air_conditioning == null ? that.air_conditioning == null : this.air_conditioning.equals(that.air_conditioning));
    equal = equal && (this.elevator == null ? that.elevator == null : this.elevator.equals(that.elevator));
    equal = equal && (this.washer == null ? that.washer == null : this.washer.equals(that.washer));
    equal = equal && (this.hangers == null ? that.hangers == null : this.hangers.equals(that.hangers));
    equal = equal && (this.iron == null ? that.iron == null : this.iron.equals(that.iron));
    equal = equal && (this.laptop_friendly_workspace == null ? that.laptop_friendly_workspace == null : this.laptop_friendly_workspace.equals(that.laptop_friendly_workspace));
    equal = equal && (this.family_kid_friendly == null ? that.family_kid_friendly == null : this.family_kid_friendly.equals(that.family_kid_friendly));
    equal = equal && (this.hot_water == null ? that.hot_water == null : this.hot_water.equals(that.hot_water));
    equal = equal && (this.cable_tv == null ? that.cable_tv == null : this.cable_tv.equals(that.cable_tv));
    equal = equal && (this.free_parking_on_premises == null ? that.free_parking_on_premises == null : this.free_parking_on_premises.equals(that.free_parking_on_premises));
    equal = equal && (this.hair_dryer == null ? that.hair_dryer == null : this.hair_dryer.equals(that.hair_dryer));
    equal = equal && (this.smoking_allowed == null ? that.smoking_allowed == null : this.smoking_allowed.equals(that.smoking_allowed));
    equal = equal && (this.doorman == null ? that.doorman == null : this.doorman.equals(that.doorman));
    equal = equal && (this.dishes_and_silverware == null ? that.dishes_and_silverware == null : this.dishes_and_silverware.equals(that.dishes_and_silverware));
    equal = equal && (this.buzzer_wireless_intercom == null ? that.buzzer_wireless_intercom == null : this.buzzer_wireless_intercom.equals(that.buzzer_wireless_intercom));
    equal = equal && (this.refrigerator == null ? that.refrigerator == null : this.refrigerator.equals(that.refrigerator));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof codegen_records)) {
      return false;
    }
    codegen_records that = (codegen_records) o;
    boolean equal = true;
    equal = equal && (this.host_since == null ? that.host_since == null : this.host_since.equals(that.host_since));
    equal = equal && (this.host_response_time == null ? that.host_response_time == null : this.host_response_time.equals(that.host_response_time));
    equal = equal && (this.host_response_rate == null ? that.host_response_rate == null : this.host_response_rate.equals(that.host_response_rate));
    equal = equal && (this.host_is_superhost == null ? that.host_is_superhost == null : this.host_is_superhost.equals(that.host_is_superhost));
    equal = equal && (this.host_has_profile_pic == null ? that.host_has_profile_pic == null : this.host_has_profile_pic.equals(that.host_has_profile_pic));
    equal = equal && (this.host_identity_verified == null ? that.host_identity_verified == null : this.host_identity_verified.equals(that.host_identity_verified));
    equal = equal && (this.neighbourhood == null ? that.neighbourhood == null : this.neighbourhood.equals(that.neighbourhood));
    equal = equal && (this.latitude == null ? that.latitude == null : this.latitude.equals(that.latitude));
    equal = equal && (this.longitude == null ? that.longitude == null : this.longitude.equals(that.longitude));
    equal = equal && (this.property_type == null ? that.property_type == null : this.property_type.equals(that.property_type));
    equal = equal && (this.room_type == null ? that.room_type == null : this.room_type.equals(that.room_type));
    equal = equal && (this.accommodates == null ? that.accommodates == null : this.accommodates.equals(that.accommodates));
    equal = equal && (this.bathrooms == null ? that.bathrooms == null : this.bathrooms.equals(that.bathrooms));
    equal = equal && (this.bedrooms == null ? that.bedrooms == null : this.bedrooms.equals(that.bedrooms));
    equal = equal && (this.beds == null ? that.beds == null : this.beds.equals(that.beds));
    equal = equal && (this.bed_type == null ? that.bed_type == null : this.bed_type.equals(that.bed_type));
    equal = equal && (this.amenities == null ? that.amenities == null : this.amenities.equals(that.amenities));
    equal = equal && (this.price == null ? that.price == null : this.price.equals(that.price));
    equal = equal && (this.security_deposit == null ? that.security_deposit == null : this.security_deposit.equals(that.security_deposit));
    equal = equal && (this.cleaning_fee == null ? that.cleaning_fee == null : this.cleaning_fee.equals(that.cleaning_fee));
    equal = equal && (this.guests_included == null ? that.guests_included == null : this.guests_included.equals(that.guests_included));
    equal = equal && (this.extra_people == null ? that.extra_people == null : this.extra_people.equals(that.extra_people));
    equal = equal && (this.minimum_nights == null ? that.minimum_nights == null : this.minimum_nights.equals(that.minimum_nights));
    equal = equal && (this.maximum_nights == null ? that.maximum_nights == null : this.maximum_nights.equals(that.maximum_nights));
    equal = equal && (this.review_scores_rating == null ? that.review_scores_rating == null : this.review_scores_rating.equals(that.review_scores_rating));
    equal = equal && (this.instant_bookable == null ? that.instant_bookable == null : this.instant_bookable.equals(that.instant_bookable));
    equal = equal && (this.cancellation_policy == null ? that.cancellation_policy == null : this.cancellation_policy.equals(that.cancellation_policy));
    equal = equal && (this.require_guest_profile_picture == null ? that.require_guest_profile_picture == null : this.require_guest_profile_picture.equals(that.require_guest_profile_picture));
    equal = equal && (this.month == null ? that.month == null : this.month.equals(that.month));
    equal = equal && (this.kitchen == null ? that.kitchen == null : this.kitchen.equals(that.kitchen));
    equal = equal && (this.wifi == null ? that.wifi == null : this.wifi.equals(that.wifi));
    equal = equal && (this.essentials == null ? that.essentials == null : this.essentials.equals(that.essentials));
    equal = equal && (this.tv == null ? that.tv == null : this.tv.equals(that.tv));
    equal = equal && (this.air_conditioning == null ? that.air_conditioning == null : this.air_conditioning.equals(that.air_conditioning));
    equal = equal && (this.elevator == null ? that.elevator == null : this.elevator.equals(that.elevator));
    equal = equal && (this.washer == null ? that.washer == null : this.washer.equals(that.washer));
    equal = equal && (this.hangers == null ? that.hangers == null : this.hangers.equals(that.hangers));
    equal = equal && (this.iron == null ? that.iron == null : this.iron.equals(that.iron));
    equal = equal && (this.laptop_friendly_workspace == null ? that.laptop_friendly_workspace == null : this.laptop_friendly_workspace.equals(that.laptop_friendly_workspace));
    equal = equal && (this.family_kid_friendly == null ? that.family_kid_friendly == null : this.family_kid_friendly.equals(that.family_kid_friendly));
    equal = equal && (this.hot_water == null ? that.hot_water == null : this.hot_water.equals(that.hot_water));
    equal = equal && (this.cable_tv == null ? that.cable_tv == null : this.cable_tv.equals(that.cable_tv));
    equal = equal && (this.free_parking_on_premises == null ? that.free_parking_on_premises == null : this.free_parking_on_premises.equals(that.free_parking_on_premises));
    equal = equal && (this.hair_dryer == null ? that.hair_dryer == null : this.hair_dryer.equals(that.hair_dryer));
    equal = equal && (this.smoking_allowed == null ? that.smoking_allowed == null : this.smoking_allowed.equals(that.smoking_allowed));
    equal = equal && (this.doorman == null ? that.doorman == null : this.doorman.equals(that.doorman));
    equal = equal && (this.dishes_and_silverware == null ? that.dishes_and_silverware == null : this.dishes_and_silverware.equals(that.dishes_and_silverware));
    equal = equal && (this.buzzer_wireless_intercom == null ? that.buzzer_wireless_intercom == null : this.buzzer_wireless_intercom.equals(that.buzzer_wireless_intercom));
    equal = equal && (this.refrigerator == null ? that.refrigerator == null : this.refrigerator.equals(that.refrigerator));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.host_since = JdbcWritableBridge.readDate(1, __dbResults);
    this.host_response_time = JdbcWritableBridge.readString(2, __dbResults);
    this.host_response_rate = JdbcWritableBridge.readInteger(3, __dbResults);
    this.host_is_superhost = JdbcWritableBridge.readBoolean(4, __dbResults);
    this.host_has_profile_pic = JdbcWritableBridge.readBoolean(5, __dbResults);
    this.host_identity_verified = JdbcWritableBridge.readBoolean(6, __dbResults);
    this.neighbourhood = JdbcWritableBridge.readString(7, __dbResults);
    this.latitude = JdbcWritableBridge.readFloat(8, __dbResults);
    this.longitude = JdbcWritableBridge.readFloat(9, __dbResults);
    this.property_type = JdbcWritableBridge.readString(10, __dbResults);
    this.room_type = JdbcWritableBridge.readString(11, __dbResults);
    this.accommodates = JdbcWritableBridge.readInteger(12, __dbResults);
    this.bathrooms = JdbcWritableBridge.readFloat(13, __dbResults);
    this.bedrooms = JdbcWritableBridge.readInteger(14, __dbResults);
    this.beds = JdbcWritableBridge.readInteger(15, __dbResults);
    this.bed_type = JdbcWritableBridge.readString(16, __dbResults);
    this.amenities = JdbcWritableBridge.readString(17, __dbResults);
    this.price = JdbcWritableBridge.readFloat(18, __dbResults);
    this.security_deposit = JdbcWritableBridge.readFloat(19, __dbResults);
    this.cleaning_fee = JdbcWritableBridge.readFloat(20, __dbResults);
    this.guests_included = JdbcWritableBridge.readInteger(21, __dbResults);
    this.extra_people = JdbcWritableBridge.readFloat(22, __dbResults);
    this.minimum_nights = JdbcWritableBridge.readInteger(23, __dbResults);
    this.maximum_nights = JdbcWritableBridge.readInteger(24, __dbResults);
    this.review_scores_rating = JdbcWritableBridge.readFloat(25, __dbResults);
    this.instant_bookable = JdbcWritableBridge.readBoolean(26, __dbResults);
    this.cancellation_policy = JdbcWritableBridge.readString(27, __dbResults);
    this.require_guest_profile_picture = JdbcWritableBridge.readBoolean(28, __dbResults);
    this.month = JdbcWritableBridge.readString(29, __dbResults);
    this.kitchen = JdbcWritableBridge.readBoolean(30, __dbResults);
    this.wifi = JdbcWritableBridge.readBoolean(31, __dbResults);
    this.essentials = JdbcWritableBridge.readBoolean(32, __dbResults);
    this.tv = JdbcWritableBridge.readBoolean(33, __dbResults);
    this.air_conditioning = JdbcWritableBridge.readBoolean(34, __dbResults);
    this.elevator = JdbcWritableBridge.readBoolean(35, __dbResults);
    this.washer = JdbcWritableBridge.readBoolean(36, __dbResults);
    this.hangers = JdbcWritableBridge.readBoolean(37, __dbResults);
    this.iron = JdbcWritableBridge.readBoolean(38, __dbResults);
    this.laptop_friendly_workspace = JdbcWritableBridge.readBoolean(39, __dbResults);
    this.family_kid_friendly = JdbcWritableBridge.readBoolean(40, __dbResults);
    this.hot_water = JdbcWritableBridge.readBoolean(41, __dbResults);
    this.cable_tv = JdbcWritableBridge.readBoolean(42, __dbResults);
    this.free_parking_on_premises = JdbcWritableBridge.readBoolean(43, __dbResults);
    this.hair_dryer = JdbcWritableBridge.readBoolean(44, __dbResults);
    this.smoking_allowed = JdbcWritableBridge.readBoolean(45, __dbResults);
    this.doorman = JdbcWritableBridge.readBoolean(46, __dbResults);
    this.dishes_and_silverware = JdbcWritableBridge.readBoolean(47, __dbResults);
    this.buzzer_wireless_intercom = JdbcWritableBridge.readBoolean(48, __dbResults);
    this.refrigerator = JdbcWritableBridge.readBoolean(49, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.host_since = JdbcWritableBridge.readDate(1, __dbResults);
    this.host_response_time = JdbcWritableBridge.readString(2, __dbResults);
    this.host_response_rate = JdbcWritableBridge.readInteger(3, __dbResults);
    this.host_is_superhost = JdbcWritableBridge.readBoolean(4, __dbResults);
    this.host_has_profile_pic = JdbcWritableBridge.readBoolean(5, __dbResults);
    this.host_identity_verified = JdbcWritableBridge.readBoolean(6, __dbResults);
    this.neighbourhood = JdbcWritableBridge.readString(7, __dbResults);
    this.latitude = JdbcWritableBridge.readFloat(8, __dbResults);
    this.longitude = JdbcWritableBridge.readFloat(9, __dbResults);
    this.property_type = JdbcWritableBridge.readString(10, __dbResults);
    this.room_type = JdbcWritableBridge.readString(11, __dbResults);
    this.accommodates = JdbcWritableBridge.readInteger(12, __dbResults);
    this.bathrooms = JdbcWritableBridge.readFloat(13, __dbResults);
    this.bedrooms = JdbcWritableBridge.readInteger(14, __dbResults);
    this.beds = JdbcWritableBridge.readInteger(15, __dbResults);
    this.bed_type = JdbcWritableBridge.readString(16, __dbResults);
    this.amenities = JdbcWritableBridge.readString(17, __dbResults);
    this.price = JdbcWritableBridge.readFloat(18, __dbResults);
    this.security_deposit = JdbcWritableBridge.readFloat(19, __dbResults);
    this.cleaning_fee = JdbcWritableBridge.readFloat(20, __dbResults);
    this.guests_included = JdbcWritableBridge.readInteger(21, __dbResults);
    this.extra_people = JdbcWritableBridge.readFloat(22, __dbResults);
    this.minimum_nights = JdbcWritableBridge.readInteger(23, __dbResults);
    this.maximum_nights = JdbcWritableBridge.readInteger(24, __dbResults);
    this.review_scores_rating = JdbcWritableBridge.readFloat(25, __dbResults);
    this.instant_bookable = JdbcWritableBridge.readBoolean(26, __dbResults);
    this.cancellation_policy = JdbcWritableBridge.readString(27, __dbResults);
    this.require_guest_profile_picture = JdbcWritableBridge.readBoolean(28, __dbResults);
    this.month = JdbcWritableBridge.readString(29, __dbResults);
    this.kitchen = JdbcWritableBridge.readBoolean(30, __dbResults);
    this.wifi = JdbcWritableBridge.readBoolean(31, __dbResults);
    this.essentials = JdbcWritableBridge.readBoolean(32, __dbResults);
    this.tv = JdbcWritableBridge.readBoolean(33, __dbResults);
    this.air_conditioning = JdbcWritableBridge.readBoolean(34, __dbResults);
    this.elevator = JdbcWritableBridge.readBoolean(35, __dbResults);
    this.washer = JdbcWritableBridge.readBoolean(36, __dbResults);
    this.hangers = JdbcWritableBridge.readBoolean(37, __dbResults);
    this.iron = JdbcWritableBridge.readBoolean(38, __dbResults);
    this.laptop_friendly_workspace = JdbcWritableBridge.readBoolean(39, __dbResults);
    this.family_kid_friendly = JdbcWritableBridge.readBoolean(40, __dbResults);
    this.hot_water = JdbcWritableBridge.readBoolean(41, __dbResults);
    this.cable_tv = JdbcWritableBridge.readBoolean(42, __dbResults);
    this.free_parking_on_premises = JdbcWritableBridge.readBoolean(43, __dbResults);
    this.hair_dryer = JdbcWritableBridge.readBoolean(44, __dbResults);
    this.smoking_allowed = JdbcWritableBridge.readBoolean(45, __dbResults);
    this.doorman = JdbcWritableBridge.readBoolean(46, __dbResults);
    this.dishes_and_silverware = JdbcWritableBridge.readBoolean(47, __dbResults);
    this.buzzer_wireless_intercom = JdbcWritableBridge.readBoolean(48, __dbResults);
    this.refrigerator = JdbcWritableBridge.readBoolean(49, __dbResults);
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
    JdbcWritableBridge.writeDate(host_since, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(host_response_time, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(host_response_rate, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(host_is_superhost, 4 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(host_has_profile_pic, 5 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(host_identity_verified, 6 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(latitude, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(longitude, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(property_type, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(accommodates, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(bathrooms, 13 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(bedrooms, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(beds, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(bed_type, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amenities, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(price, 18 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(security_deposit, 19 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(cleaning_fee, 20 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(guests_included, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(extra_people, 22 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(minimum_nights, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(maximum_nights, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(review_scores_rating, 25 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeBoolean(instant_bookable, 26 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(cancellation_policy, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(require_guest_profile_picture, 28 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(month, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(kitchen, 30 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(wifi, 31 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(essentials, 32 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(tv, 33 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(air_conditioning, 34 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(elevator, 35 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(washer, 36 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(hangers, 37 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(iron, 38 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(laptop_friendly_workspace, 39 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(family_kid_friendly, 40 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(hot_water, 41 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(cable_tv, 42 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(free_parking_on_premises, 43 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(hair_dryer, 44 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(smoking_allowed, 45 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(doorman, 46 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(dishes_and_silverware, 47 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(buzzer_wireless_intercom, 48 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(refrigerator, 49 + __off, -7, __dbStmt);
    return 49;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeDate(host_since, 1 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(host_response_time, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(host_response_rate, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(host_is_superhost, 4 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(host_has_profile_pic, 5 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(host_identity_verified, 6 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(neighbourhood, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(latitude, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(longitude, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(property_type, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(room_type, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(accommodates, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(bathrooms, 13 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(bedrooms, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(beds, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(bed_type, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(amenities, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(price, 18 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(security_deposit, 19 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(cleaning_fee, 20 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(guests_included, 21 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(extra_people, 22 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeInteger(minimum_nights, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(maximum_nights, 24 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(review_scores_rating, 25 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeBoolean(instant_bookable, 26 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(cancellation_policy, 27 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(require_guest_profile_picture, 28 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeString(month, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(kitchen, 30 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(wifi, 31 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(essentials, 32 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(tv, 33 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(air_conditioning, 34 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(elevator, 35 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(washer, 36 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(hangers, 37 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(iron, 38 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(laptop_friendly_workspace, 39 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(family_kid_friendly, 40 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(hot_water, 41 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(cable_tv, 42 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(free_parking_on_premises, 43 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(hair_dryer, 44 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(smoking_allowed, 45 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(doorman, 46 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(dishes_and_silverware, 47 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(buzzer_wireless_intercom, 48 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeBoolean(refrigerator, 49 + __off, -7, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.host_since = null;
    } else {
    this.host_since = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.host_response_time = null;
    } else {
    this.host_response_time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.host_response_rate = null;
    } else {
    this.host_response_rate = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.host_is_superhost = null;
    } else {
    this.host_is_superhost = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.host_has_profile_pic = null;
    } else {
    this.host_has_profile_pic = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.host_identity_verified = null;
    } else {
    this.host_identity_verified = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.neighbourhood = null;
    } else {
    this.neighbourhood = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.latitude = null;
    } else {
    this.latitude = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.longitude = null;
    } else {
    this.longitude = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.property_type = null;
    } else {
    this.property_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.room_type = null;
    } else {
    this.room_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.accommodates = null;
    } else {
    this.accommodates = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.bathrooms = null;
    } else {
    this.bathrooms = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.bedrooms = null;
    } else {
    this.bedrooms = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.beds = null;
    } else {
    this.beds = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.bed_type = null;
    } else {
    this.bed_type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.amenities = null;
    } else {
    this.amenities = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.price = null;
    } else {
    this.price = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.security_deposit = null;
    } else {
    this.security_deposit = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.cleaning_fee = null;
    } else {
    this.cleaning_fee = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.guests_included = null;
    } else {
    this.guests_included = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.extra_people = null;
    } else {
    this.extra_people = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.minimum_nights = null;
    } else {
    this.minimum_nights = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.maximum_nights = null;
    } else {
    this.maximum_nights = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.review_scores_rating = null;
    } else {
    this.review_scores_rating = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.instant_bookable = null;
    } else {
    this.instant_bookable = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.cancellation_policy = null;
    } else {
    this.cancellation_policy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.require_guest_profile_picture = null;
    } else {
    this.require_guest_profile_picture = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.month = null;
    } else {
    this.month = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.kitchen = null;
    } else {
    this.kitchen = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.wifi = null;
    } else {
    this.wifi = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.essentials = null;
    } else {
    this.essentials = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.tv = null;
    } else {
    this.tv = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.air_conditioning = null;
    } else {
    this.air_conditioning = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.elevator = null;
    } else {
    this.elevator = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.washer = null;
    } else {
    this.washer = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.hangers = null;
    } else {
    this.hangers = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.iron = null;
    } else {
    this.iron = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.laptop_friendly_workspace = null;
    } else {
    this.laptop_friendly_workspace = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.family_kid_friendly = null;
    } else {
    this.family_kid_friendly = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.hot_water = null;
    } else {
    this.hot_water = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.cable_tv = null;
    } else {
    this.cable_tv = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.free_parking_on_premises = null;
    } else {
    this.free_parking_on_premises = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.hair_dryer = null;
    } else {
    this.hair_dryer = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.smoking_allowed = null;
    } else {
    this.smoking_allowed = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.doorman = null;
    } else {
    this.doorman = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.dishes_and_silverware = null;
    } else {
    this.dishes_and_silverware = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.buzzer_wireless_intercom = null;
    } else {
    this.buzzer_wireless_intercom = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.refrigerator = null;
    } else {
    this.refrigerator = Boolean.valueOf(__dataIn.readBoolean());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.host_since) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.host_since.getTime());
    }
    if (null == this.host_response_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_response_time);
    }
    if (null == this.host_response_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.host_response_rate);
    }
    if (null == this.host_is_superhost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.host_is_superhost);
    }
    if (null == this.host_has_profile_pic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.host_has_profile_pic);
    }
    if (null == this.host_identity_verified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.host_identity_verified);
    }
    if (null == this.neighbourhood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.longitude);
    }
    if (null == this.property_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property_type);
    }
    if (null == this.room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_type);
    }
    if (null == this.accommodates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.accommodates);
    }
    if (null == this.bathrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.bathrooms);
    }
    if (null == this.bedrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bedrooms);
    }
    if (null == this.beds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.beds);
    }
    if (null == this.bed_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bed_type);
    }
    if (null == this.amenities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amenities);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.price);
    }
    if (null == this.security_deposit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.security_deposit);
    }
    if (null == this.cleaning_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.cleaning_fee);
    }
    if (null == this.guests_included) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.guests_included);
    }
    if (null == this.extra_people) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.extra_people);
    }
    if (null == this.minimum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.minimum_nights);
    }
    if (null == this.maximum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.maximum_nights);
    }
    if (null == this.review_scores_rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.review_scores_rating);
    }
    if (null == this.instant_bookable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.instant_bookable);
    }
    if (null == this.cancellation_policy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cancellation_policy);
    }
    if (null == this.require_guest_profile_picture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.require_guest_profile_picture);
    }
    if (null == this.month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, month);
    }
    if (null == this.kitchen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.kitchen);
    }
    if (null == this.wifi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.wifi);
    }
    if (null == this.essentials) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.essentials);
    }
    if (null == this.tv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tv);
    }
    if (null == this.air_conditioning) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.air_conditioning);
    }
    if (null == this.elevator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.elevator);
    }
    if (null == this.washer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.washer);
    }
    if (null == this.hangers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.hangers);
    }
    if (null == this.iron) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.iron);
    }
    if (null == this.laptop_friendly_workspace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.laptop_friendly_workspace);
    }
    if (null == this.family_kid_friendly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.family_kid_friendly);
    }
    if (null == this.hot_water) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.hot_water);
    }
    if (null == this.cable_tv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.cable_tv);
    }
    if (null == this.free_parking_on_premises) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.free_parking_on_premises);
    }
    if (null == this.hair_dryer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.hair_dryer);
    }
    if (null == this.smoking_allowed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.smoking_allowed);
    }
    if (null == this.doorman) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.doorman);
    }
    if (null == this.dishes_and_silverware) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.dishes_and_silverware);
    }
    if (null == this.buzzer_wireless_intercom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.buzzer_wireless_intercom);
    }
    if (null == this.refrigerator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.refrigerator);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.host_since) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.host_since.getTime());
    }
    if (null == this.host_response_time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, host_response_time);
    }
    if (null == this.host_response_rate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.host_response_rate);
    }
    if (null == this.host_is_superhost) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.host_is_superhost);
    }
    if (null == this.host_has_profile_pic) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.host_has_profile_pic);
    }
    if (null == this.host_identity_verified) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.host_identity_verified);
    }
    if (null == this.neighbourhood) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, neighbourhood);
    }
    if (null == this.latitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.latitude);
    }
    if (null == this.longitude) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.longitude);
    }
    if (null == this.property_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, property_type);
    }
    if (null == this.room_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, room_type);
    }
    if (null == this.accommodates) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.accommodates);
    }
    if (null == this.bathrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.bathrooms);
    }
    if (null == this.bedrooms) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.bedrooms);
    }
    if (null == this.beds) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.beds);
    }
    if (null == this.bed_type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bed_type);
    }
    if (null == this.amenities) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, amenities);
    }
    if (null == this.price) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.price);
    }
    if (null == this.security_deposit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.security_deposit);
    }
    if (null == this.cleaning_fee) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.cleaning_fee);
    }
    if (null == this.guests_included) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.guests_included);
    }
    if (null == this.extra_people) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.extra_people);
    }
    if (null == this.minimum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.minimum_nights);
    }
    if (null == this.maximum_nights) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.maximum_nights);
    }
    if (null == this.review_scores_rating) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.review_scores_rating);
    }
    if (null == this.instant_bookable) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.instant_bookable);
    }
    if (null == this.cancellation_policy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cancellation_policy);
    }
    if (null == this.require_guest_profile_picture) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.require_guest_profile_picture);
    }
    if (null == this.month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, month);
    }
    if (null == this.kitchen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.kitchen);
    }
    if (null == this.wifi) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.wifi);
    }
    if (null == this.essentials) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.essentials);
    }
    if (null == this.tv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.tv);
    }
    if (null == this.air_conditioning) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.air_conditioning);
    }
    if (null == this.elevator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.elevator);
    }
    if (null == this.washer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.washer);
    }
    if (null == this.hangers) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.hangers);
    }
    if (null == this.iron) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.iron);
    }
    if (null == this.laptop_friendly_workspace) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.laptop_friendly_workspace);
    }
    if (null == this.family_kid_friendly) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.family_kid_friendly);
    }
    if (null == this.hot_water) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.hot_water);
    }
    if (null == this.cable_tv) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.cable_tv);
    }
    if (null == this.free_parking_on_premises) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.free_parking_on_premises);
    }
    if (null == this.hair_dryer) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.hair_dryer);
    }
    if (null == this.smoking_allowed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.smoking_allowed);
    }
    if (null == this.doorman) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.doorman);
    }
    if (null == this.dishes_and_silverware) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.dishes_and_silverware);
    }
    if (null == this.buzzer_wireless_intercom) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.buzzer_wireless_intercom);
    }
    if (null == this.refrigerator) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.refrigerator);
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
    __sb.append(FieldFormatter.escapeAndEnclose(host_since==null?"null":"" + host_since, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_time==null?"null":host_response_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_rate==null?"null":"" + host_response_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_is_superhost==null?"null":"" + host_is_superhost, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_has_profile_pic==null?"null":"" + host_has_profile_pic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_identity_verified==null?"null":"" + host_identity_verified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood==null?"null":neighbourhood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":"" + latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":"" + longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property_type==null?"null":property_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_type==null?"null":room_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(accommodates==null?"null":"" + accommodates, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bathrooms==null?"null":"" + bathrooms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bedrooms==null?"null":"" + bedrooms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beds==null?"null":"" + beds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bed_type==null?"null":bed_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amenities==null?"null":amenities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(security_deposit==null?"null":"" + security_deposit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cleaning_fee==null?"null":"" + cleaning_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guests_included==null?"null":"" + guests_included, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(extra_people==null?"null":"" + extra_people, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minimum_nights==null?"null":"" + minimum_nights, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maximum_nights==null?"null":"" + maximum_nights, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_rating==null?"null":"" + review_scores_rating, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(instant_bookable==null?"null":"" + instant_bookable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancellation_policy==null?"null":cancellation_policy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(require_guest_profile_picture==null?"null":"" + require_guest_profile_picture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(month==null?"null":month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(kitchen==null?"null":"" + kitchen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wifi==null?"null":"" + wifi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(essentials==null?"null":"" + essentials, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv==null?"null":"" + tv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(air_conditioning==null?"null":"" + air_conditioning, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevator==null?"null":"" + elevator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(washer==null?"null":"" + washer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hangers==null?"null":"" + hangers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iron==null?"null":"" + iron, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(laptop_friendly_workspace==null?"null":"" + laptop_friendly_workspace, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(family_kid_friendly==null?"null":"" + family_kid_friendly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hot_water==null?"null":"" + hot_water, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cable_tv==null?"null":"" + cable_tv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(free_parking_on_premises==null?"null":"" + free_parking_on_premises, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hair_dryer==null?"null":"" + hair_dryer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(smoking_allowed==null?"null":"" + smoking_allowed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(doorman==null?"null":"" + doorman, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dishes_and_silverware==null?"null":"" + dishes_and_silverware, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buzzer_wireless_intercom==null?"null":"" + buzzer_wireless_intercom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refrigerator==null?"null":"" + refrigerator, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(host_since==null?"null":"" + host_since, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_time==null?"null":host_response_time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_response_rate==null?"null":"" + host_response_rate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_is_superhost==null?"null":"" + host_is_superhost, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_has_profile_pic==null?"null":"" + host_has_profile_pic, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(host_identity_verified==null?"null":"" + host_identity_verified, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(neighbourhood==null?"null":neighbourhood, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(latitude==null?"null":"" + latitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(longitude==null?"null":"" + longitude, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(property_type==null?"null":property_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(room_type==null?"null":room_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(accommodates==null?"null":"" + accommodates, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bathrooms==null?"null":"" + bathrooms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bedrooms==null?"null":"" + bedrooms, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(beds==null?"null":"" + beds, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bed_type==null?"null":bed_type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(amenities==null?"null":amenities, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(price==null?"null":"" + price, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(security_deposit==null?"null":"" + security_deposit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cleaning_fee==null?"null":"" + cleaning_fee, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(guests_included==null?"null":"" + guests_included, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(extra_people==null?"null":"" + extra_people, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(minimum_nights==null?"null":"" + minimum_nights, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maximum_nights==null?"null":"" + maximum_nights, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(review_scores_rating==null?"null":"" + review_scores_rating, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(instant_bookable==null?"null":"" + instant_bookable, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cancellation_policy==null?"null":cancellation_policy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(require_guest_profile_picture==null?"null":"" + require_guest_profile_picture, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(month==null?"null":month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(kitchen==null?"null":"" + kitchen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wifi==null?"null":"" + wifi, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(essentials==null?"null":"" + essentials, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tv==null?"null":"" + tv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(air_conditioning==null?"null":"" + air_conditioning, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(elevator==null?"null":"" + elevator, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(washer==null?"null":"" + washer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hangers==null?"null":"" + hangers, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(iron==null?"null":"" + iron, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(laptop_friendly_workspace==null?"null":"" + laptop_friendly_workspace, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(family_kid_friendly==null?"null":"" + family_kid_friendly, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hot_water==null?"null":"" + hot_water, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cable_tv==null?"null":"" + cable_tv, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(free_parking_on_premises==null?"null":"" + free_parking_on_premises, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hair_dryer==null?"null":"" + hair_dryer, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(smoking_allowed==null?"null":"" + smoking_allowed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(doorman==null?"null":"" + doorman, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dishes_and_silverware==null?"null":"" + dishes_and_silverware, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(buzzer_wireless_intercom==null?"null":"" + buzzer_wireless_intercom, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(refrigerator==null?"null":"" + refrigerator, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_since = null; } else {
      this.host_since = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_response_time = null; } else {
      this.host_response_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_response_rate = null; } else {
      this.host_response_rate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_is_superhost = null; } else {
      this.host_is_superhost = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_has_profile_pic = null; } else {
      this.host_has_profile_pic = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_identity_verified = null; } else {
      this.host_identity_verified = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood = null; } else {
      this.neighbourhood = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property_type = null; } else {
      this.property_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.room_type = null; } else {
      this.room_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.accommodates = null; } else {
      this.accommodates = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bathrooms = null; } else {
      this.bathrooms = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bedrooms = null; } else {
      this.bedrooms = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beds = null; } else {
      this.beds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.bed_type = null; } else {
      this.bed_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.amenities = null; } else {
      this.amenities = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.security_deposit = null; } else {
      this.security_deposit = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cleaning_fee = null; } else {
      this.cleaning_fee = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.guests_included = null; } else {
      this.guests_included = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.extra_people = null; } else {
      this.extra_people = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.minimum_nights = null; } else {
      this.minimum_nights = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maximum_nights = null; } else {
      this.maximum_nights = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_rating = null; } else {
      this.review_scores_rating = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.instant_bookable = null; } else {
      this.instant_bookable = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cancellation_policy = null; } else {
      this.cancellation_policy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.require_guest_profile_picture = null; } else {
      this.require_guest_profile_picture = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.month = null; } else {
      this.month = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.kitchen = null; } else {
      this.kitchen = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wifi = null; } else {
      this.wifi = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.essentials = null; } else {
      this.essentials = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tv = null; } else {
      this.tv = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.air_conditioning = null; } else {
      this.air_conditioning = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevator = null; } else {
      this.elevator = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.washer = null; } else {
      this.washer = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hangers = null; } else {
      this.hangers = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.iron = null; } else {
      this.iron = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.laptop_friendly_workspace = null; } else {
      this.laptop_friendly_workspace = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.family_kid_friendly = null; } else {
      this.family_kid_friendly = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hot_water = null; } else {
      this.hot_water = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cable_tv = null; } else {
      this.cable_tv = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.free_parking_on_premises = null; } else {
      this.free_parking_on_premises = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hair_dryer = null; } else {
      this.hair_dryer = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.smoking_allowed = null; } else {
      this.smoking_allowed = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.doorman = null; } else {
      this.doorman = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dishes_and_silverware = null; } else {
      this.dishes_and_silverware = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buzzer_wireless_intercom = null; } else {
      this.buzzer_wireless_intercom = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refrigerator = null; } else {
      this.refrigerator = BooleanParser.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_since = null; } else {
      this.host_since = java.sql.Date.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.host_response_time = null; } else {
      this.host_response_time = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_response_rate = null; } else {
      this.host_response_rate = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_is_superhost = null; } else {
      this.host_is_superhost = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_has_profile_pic = null; } else {
      this.host_has_profile_pic = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.host_identity_verified = null; } else {
      this.host_identity_verified = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.neighbourhood = null; } else {
      this.neighbourhood = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.latitude = null; } else {
      this.latitude = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.longitude = null; } else {
      this.longitude = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.property_type = null; } else {
      this.property_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.room_type = null; } else {
      this.room_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.accommodates = null; } else {
      this.accommodates = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bathrooms = null; } else {
      this.bathrooms = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.bedrooms = null; } else {
      this.bedrooms = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.beds = null; } else {
      this.beds = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.bed_type = null; } else {
      this.bed_type = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.amenities = null; } else {
      this.amenities = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.price = null; } else {
      this.price = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.security_deposit = null; } else {
      this.security_deposit = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cleaning_fee = null; } else {
      this.cleaning_fee = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.guests_included = null; } else {
      this.guests_included = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.extra_people = null; } else {
      this.extra_people = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.minimum_nights = null; } else {
      this.minimum_nights = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maximum_nights = null; } else {
      this.maximum_nights = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.review_scores_rating = null; } else {
      this.review_scores_rating = Float.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.instant_bookable = null; } else {
      this.instant_bookable = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.cancellation_policy = null; } else {
      this.cancellation_policy = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.require_guest_profile_picture = null; } else {
      this.require_guest_profile_picture = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.month = null; } else {
      this.month = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.kitchen = null; } else {
      this.kitchen = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wifi = null; } else {
      this.wifi = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.essentials = null; } else {
      this.essentials = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.tv = null; } else {
      this.tv = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.air_conditioning = null; } else {
      this.air_conditioning = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.elevator = null; } else {
      this.elevator = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.washer = null; } else {
      this.washer = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hangers = null; } else {
      this.hangers = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.iron = null; } else {
      this.iron = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.laptop_friendly_workspace = null; } else {
      this.laptop_friendly_workspace = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.family_kid_friendly = null; } else {
      this.family_kid_friendly = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hot_water = null; } else {
      this.hot_water = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cable_tv = null; } else {
      this.cable_tv = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.free_parking_on_premises = null; } else {
      this.free_parking_on_premises = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hair_dryer = null; } else {
      this.hair_dryer = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.smoking_allowed = null; } else {
      this.smoking_allowed = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.doorman = null; } else {
      this.doorman = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dishes_and_silverware = null; } else {
      this.dishes_and_silverware = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.buzzer_wireless_intercom = null; } else {
      this.buzzer_wireless_intercom = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.refrigerator = null; } else {
      this.refrigerator = BooleanParser.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    codegen_records o = (codegen_records) super.clone();
    o.host_since = (o.host_since != null) ? (java.sql.Date) o.host_since.clone() : null;
    return o;
  }

  public void clone0(codegen_records o) throws CloneNotSupportedException {
    o.host_since = (o.host_since != null) ? (java.sql.Date) o.host_since.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("host_since", this.host_since);
    __sqoop$field_map.put("host_response_time", this.host_response_time);
    __sqoop$field_map.put("host_response_rate", this.host_response_rate);
    __sqoop$field_map.put("host_is_superhost", this.host_is_superhost);
    __sqoop$field_map.put("host_has_profile_pic", this.host_has_profile_pic);
    __sqoop$field_map.put("host_identity_verified", this.host_identity_verified);
    __sqoop$field_map.put("neighbourhood", this.neighbourhood);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("property_type", this.property_type);
    __sqoop$field_map.put("room_type", this.room_type);
    __sqoop$field_map.put("accommodates", this.accommodates);
    __sqoop$field_map.put("bathrooms", this.bathrooms);
    __sqoop$field_map.put("bedrooms", this.bedrooms);
    __sqoop$field_map.put("beds", this.beds);
    __sqoop$field_map.put("bed_type", this.bed_type);
    __sqoop$field_map.put("amenities", this.amenities);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("security_deposit", this.security_deposit);
    __sqoop$field_map.put("cleaning_fee", this.cleaning_fee);
    __sqoop$field_map.put("guests_included", this.guests_included);
    __sqoop$field_map.put("extra_people", this.extra_people);
    __sqoop$field_map.put("minimum_nights", this.minimum_nights);
    __sqoop$field_map.put("maximum_nights", this.maximum_nights);
    __sqoop$field_map.put("review_scores_rating", this.review_scores_rating);
    __sqoop$field_map.put("instant_bookable", this.instant_bookable);
    __sqoop$field_map.put("cancellation_policy", this.cancellation_policy);
    __sqoop$field_map.put("require_guest_profile_picture", this.require_guest_profile_picture);
    __sqoop$field_map.put("month", this.month);
    __sqoop$field_map.put("kitchen", this.kitchen);
    __sqoop$field_map.put("wifi", this.wifi);
    __sqoop$field_map.put("essentials", this.essentials);
    __sqoop$field_map.put("tv", this.tv);
    __sqoop$field_map.put("air_conditioning", this.air_conditioning);
    __sqoop$field_map.put("elevator", this.elevator);
    __sqoop$field_map.put("washer", this.washer);
    __sqoop$field_map.put("hangers", this.hangers);
    __sqoop$field_map.put("iron", this.iron);
    __sqoop$field_map.put("laptop_friendly_workspace", this.laptop_friendly_workspace);
    __sqoop$field_map.put("family_kid_friendly", this.family_kid_friendly);
    __sqoop$field_map.put("hot_water", this.hot_water);
    __sqoop$field_map.put("cable_tv", this.cable_tv);
    __sqoop$field_map.put("free_parking_on_premises", this.free_parking_on_premises);
    __sqoop$field_map.put("hair_dryer", this.hair_dryer);
    __sqoop$field_map.put("smoking_allowed", this.smoking_allowed);
    __sqoop$field_map.put("doorman", this.doorman);
    __sqoop$field_map.put("dishes_and_silverware", this.dishes_and_silverware);
    __sqoop$field_map.put("buzzer_wireless_intercom", this.buzzer_wireless_intercom);
    __sqoop$field_map.put("refrigerator", this.refrigerator);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("host_since", this.host_since);
    __sqoop$field_map.put("host_response_time", this.host_response_time);
    __sqoop$field_map.put("host_response_rate", this.host_response_rate);
    __sqoop$field_map.put("host_is_superhost", this.host_is_superhost);
    __sqoop$field_map.put("host_has_profile_pic", this.host_has_profile_pic);
    __sqoop$field_map.put("host_identity_verified", this.host_identity_verified);
    __sqoop$field_map.put("neighbourhood", this.neighbourhood);
    __sqoop$field_map.put("latitude", this.latitude);
    __sqoop$field_map.put("longitude", this.longitude);
    __sqoop$field_map.put("property_type", this.property_type);
    __sqoop$field_map.put("room_type", this.room_type);
    __sqoop$field_map.put("accommodates", this.accommodates);
    __sqoop$field_map.put("bathrooms", this.bathrooms);
    __sqoop$field_map.put("bedrooms", this.bedrooms);
    __sqoop$field_map.put("beds", this.beds);
    __sqoop$field_map.put("bed_type", this.bed_type);
    __sqoop$field_map.put("amenities", this.amenities);
    __sqoop$field_map.put("price", this.price);
    __sqoop$field_map.put("security_deposit", this.security_deposit);
    __sqoop$field_map.put("cleaning_fee", this.cleaning_fee);
    __sqoop$field_map.put("guests_included", this.guests_included);
    __sqoop$field_map.put("extra_people", this.extra_people);
    __sqoop$field_map.put("minimum_nights", this.minimum_nights);
    __sqoop$field_map.put("maximum_nights", this.maximum_nights);
    __sqoop$field_map.put("review_scores_rating", this.review_scores_rating);
    __sqoop$field_map.put("instant_bookable", this.instant_bookable);
    __sqoop$field_map.put("cancellation_policy", this.cancellation_policy);
    __sqoop$field_map.put("require_guest_profile_picture", this.require_guest_profile_picture);
    __sqoop$field_map.put("month", this.month);
    __sqoop$field_map.put("kitchen", this.kitchen);
    __sqoop$field_map.put("wifi", this.wifi);
    __sqoop$field_map.put("essentials", this.essentials);
    __sqoop$field_map.put("tv", this.tv);
    __sqoop$field_map.put("air_conditioning", this.air_conditioning);
    __sqoop$field_map.put("elevator", this.elevator);
    __sqoop$field_map.put("washer", this.washer);
    __sqoop$field_map.put("hangers", this.hangers);
    __sqoop$field_map.put("iron", this.iron);
    __sqoop$field_map.put("laptop_friendly_workspace", this.laptop_friendly_workspace);
    __sqoop$field_map.put("family_kid_friendly", this.family_kid_friendly);
    __sqoop$field_map.put("hot_water", this.hot_water);
    __sqoop$field_map.put("cable_tv", this.cable_tv);
    __sqoop$field_map.put("free_parking_on_premises", this.free_parking_on_premises);
    __sqoop$field_map.put("hair_dryer", this.hair_dryer);
    __sqoop$field_map.put("smoking_allowed", this.smoking_allowed);
    __sqoop$field_map.put("doorman", this.doorman);
    __sqoop$field_map.put("dishes_and_silverware", this.dishes_and_silverware);
    __sqoop$field_map.put("buzzer_wireless_intercom", this.buzzer_wireless_intercom);
    __sqoop$field_map.put("refrigerator", this.refrigerator);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
