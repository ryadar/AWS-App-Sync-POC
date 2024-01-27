package com.ryadar.app.sync.poc.com.amplifyframework.datastore.generated.model;


import androidx.core.util.ObjectsCompat;

import java.util.Objects;
import java.util.List;

/** This is an auto generated class representing the ProfileConnection type in your schema. */
public final class ProfileConnection {
  private final List<Profile> items;
  private final String nextToken;
  public List<Profile> getItems() {
      return items;
  }
  
  public String getNextToken() {
      return nextToken;
  }
  
  private ProfileConnection(List<Profile> items, String nextToken) {
    this.items = items;
    this.nextToken = nextToken;
  }
  
  @Override
   public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      } else if(obj == null || getClass() != obj.getClass()) {
        return false;
      } else {
      ProfileConnection profileConnection = (ProfileConnection) obj;
      return ObjectsCompat.equals(getItems(), profileConnection.getItems()) &&
              ObjectsCompat.equals(getNextToken(), profileConnection.getNextToken());
      }
  }
  
  @Override
   public int hashCode() {
    return new StringBuilder()
      .append(getItems())
      .append(getNextToken())
      .toString()
      .hashCode();
  }
  
  public static BuildStep builder() {
      return new Builder();
  }
  
  public CopyOfBuilder copyOfBuilder() {
    return new CopyOfBuilder(items,
      nextToken);
  }
  public interface BuildStep {
    ProfileConnection build();
    BuildStep items(List<Profile> items);
    BuildStep nextToken(String nextToken);
  }
  

  public static class Builder implements BuildStep {
    private List<Profile> items;
    private String nextToken;
    public Builder() {
      
    }
    
    private Builder(List<Profile> items, String nextToken) {
      this.items = items;
      this.nextToken = nextToken;
    }
    
    @Override
     public ProfileConnection build() {
        
        return new ProfileConnection(
          items,
          nextToken);
    }
    
    @Override
     public BuildStep items(List<Profile> items) {
        this.items = items;
        return this;
    }
    
    @Override
     public BuildStep nextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
  }
  

  public final class CopyOfBuilder extends Builder {
    private CopyOfBuilder(List<Profile> items, String nextToken) {
      super(items, nextToken);
      
    }
    
    @Override
     public CopyOfBuilder items(List<Profile> items) {
      return (CopyOfBuilder) super.items(items);
    }
    
    @Override
     public CopyOfBuilder nextToken(String nextToken) {
      return (CopyOfBuilder) super.nextToken(nextToken);
    }
  }
  
}
