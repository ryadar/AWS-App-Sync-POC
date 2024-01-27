package com.ryadar.app.sync.poc;

import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.core.model.ModelIdentifier;

import java.util.List;
import java.util.UUID;
import java.util.Objects;

import androidx.core.util.ObjectsCompat;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;

import static com.amplifyframework.core.model.query.predicate.QueryField.field;

/** This is an auto generated class representing the Profile type in your schema. */
@SuppressWarnings("all")
@ModelConfig(pluralName = "Profiles", type = Model.Type.USER, version = 1)
public final class Profile implements Model {
  public static final QueryField ID = field("Profile", "id");
  public static final QueryField EMAIL = field("Profile", "email");
  public static final QueryField NAME = field("Profile", "name");
  public static final QueryField PHONE_NUMBER = field("Profile", "phoneNumber");
  private final @ModelField(targetType="Int", isRequired = true) Integer id;
  private final @ModelField(targetType="String") String email;
  private final @ModelField(targetType="String") String name;
  private final @ModelField(targetType="String") String phoneNumber;

  /** @deprecated This API is internal to Amplify and should not be used. */
  @Deprecated
   public Integer resolveIdentifier() {
    return id;
  }
  
  public Integer getId() {
      return id;
  }
  
  public String getEmail() {
      return email;
  }
  
  public String getName() {
      return name;
  }
  
  public String getPhoneNumber() {
      return phoneNumber;
  }
  

  private Profile(Integer id, String email, String name, String phoneNumber) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.phoneNumber = phoneNumber;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      Profile profile = (Profile) obj;
      return ObjectsCompat.equals(getId(), profile.getId()) &&
              ObjectsCompat.equals(getEmail(), profile.getEmail()) &&
              ObjectsCompat.equals(getName(), profile.getName()) &&
              ObjectsCompat.equals(getPhoneNumber(), profile.getPhoneNumber());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getId())
      .append(getEmail())
      .append(getName())
      .append(getPhoneNumber())
      .toString()
      .hashCode();
  }
  
  @Override
   public String toString() {
    return new StringBuilder()
      .append("Profile {")
      .append("id=" + String.valueOf(getId()) + ", ")
      .append("email=" + String.valueOf(getEmail()) + ", ")
      .append("name=" + String.valueOf(getName()) + ", ")
      .append("phoneNumber=" + String.valueOf(getPhoneNumber()) + ", ")
      .append("}")
      .toString();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  /**
   * WARNING: This method should not be used to build an instance of this object for a CREATE mutation.
   * This is a convenience method to return an instance of the object with only its ID populated
   * to be used in the context of a parameter in a delete mutation or referencing a foreign key
   * in a relationship.
   * @param id the id of the existing item this instance will represent
   * @return an instance of this model with only ID populated
   */
  public static Profile justId(Integer id) {
    return new Profile(
          id,
      null,
      null,
      null
    );
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(id,
      email,
      name,
      phoneNumber);
  }
  public interface BuildStep {
    Profile build();
    BuildStep id(String id);
    BuildStep email(String email);
    BuildStep name(String name);
    BuildStep phoneNumber(String phoneNumber);
  }
  

  public static class Builder implements BuildStep {
    private Integer id;
    private String email;
    private String name;
    private String phoneNumber;
    public Builder() {
      
    }
    
    private Builder(Integer id, String email, String name, String phoneNumber) {
      this.id = id;
      this.email = email;
      this.name = name;
      this.phoneNumber = phoneNumber;
    }
    
    @Override
     public Profile build() {
        Integer id = this.id != null ? this.id : -1;
        
        return new Profile(
          id,
          email,
          name,
          phoneNumber);
    }

      @Override
      public BuildStep id(String id) {
          return null;
      }

      @Override
     public BuildStep email(String email) {
        this.email = email;
        return this;
    }
    
    @Override
     public BuildStep name(String name) {
        this.name = name;
        return this;
    }
    
    @Override
     public BuildStep phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    
    /**
     * @param id id
     * @return Current Builder instance, for fluent method chaining
     */
    public BuildStep id(Integer id) {
        this.id = id;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(Integer id, String email, String name, String phoneNumber) {
      super(id, email, name, phoneNumber);
      
    }
    
    @Override
     public CopyOfBuilder email(String email) {
      return (CopyOfBuilder) super.email(email);
    }
    
    @Override
     public CopyOfBuilder name(String name) {
      return (CopyOfBuilder) super.name(name);
    }
    
    @Override
     public CopyOfBuilder phoneNumber(String phoneNumber) {
      return (CopyOfBuilder) super.phoneNumber(phoneNumber);
    }
  }
  

  public static class ProfileIdentifier extends ModelIdentifier<Profile> {
    private static final long serialVersionUID = 1L;
    public ProfileIdentifier(Integer id) {
      super(id);
    }
  }
  
}
