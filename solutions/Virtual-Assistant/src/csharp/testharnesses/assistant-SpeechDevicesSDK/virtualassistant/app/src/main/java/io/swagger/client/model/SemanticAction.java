/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a reference to a programmatic action
 */
@ApiModel(description = "Represents a reference to a programmatic action")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class SemanticAction {
  @SerializedName("id")
  private String id = null;

  @SerializedName("entities")
  private Map<String, Object> entities = null;

  public SemanticAction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of this action
   * @return id
  **/
  @ApiModelProperty(value = "ID of this action")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SemanticAction entities(Map<String, Object> entities) {
    this.entities = entities;
    return this;
  }

  public SemanticAction putEntitiesItem(String key, Object entitiesItem) {
    if (this.entities == null) {
      this.entities = new HashMap<String, Object>();
    }
    this.entities.put(key, entitiesItem);
    return this;
  }

   /**
   * Entities associated with this action
   * @return entities
  **/
  @ApiModelProperty(value = "Entities associated with this action")
  public Map<String, Object> getEntities() {
    return entities;
  }

  public void setEntities(Map<String, Object> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SemanticAction semanticAction = (SemanticAction) o;
    return Objects.equals(this.id, semanticAction.id) &&
        Objects.equals(this.entities, semanticAction.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SemanticAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

