
package udmi.schema;

import java.util.Date;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Metadata
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "version",
    "description",
    "hash",
    "cloud",
    "system",
    "gateway",
    "localnet",
    "testing",
    "pointset"
})
@Generated("jsonschema2pojo")
public class Metadata {

    /**
     * RFC 3339 timestamp the metadata was generated
     * (Required)
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("RFC 3339 timestamp the metadata was generated")
    public Date timestamp;
    /**
     * Major version of the UDMI schema
     * (Required)
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Major version of the UDMI schema")
    public Integer version;
    /**
     * Generic human-readable text describing the device
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Generic human-readable text describing the device")
    public String description;
    /**
     * Automatically generated field that contains the hash of file contents.
     * 
     */
    @JsonProperty("hash")
    @JsonPropertyDescription("Automatically generated field that contains the hash of file contents.")
    public String hash;
    /**
     * Cloud Metadata
     * <p>
     * Information specific to how the device communicates with the cloud.
     * 
     */
    @JsonProperty("cloud")
    @JsonPropertyDescription("Information specific to how the device communicates with the cloud.")
    public CloudMetadata cloud;
    /**
     * System Metadata
     * <p>
     * High-level sytem informaiton about the device.
     * (Required)
     * 
     */
    @JsonProperty("system")
    @JsonPropertyDescription("High-level sytem informaiton about the device.")
    public SystemMetadata system;
    /**
     * Gateway Metadata
     * <p>
     * Read more: <https://github.com/faucetsdn/udmi/blob/master/docs/gateway.md>
     * 
     */
    @JsonProperty("gateway")
    @JsonPropertyDescription("Read more: <https://github.com/faucetsdn/udmi/blob/master/docs/gateway.md>")
    public GatewayMetadata gateway;
    /**
     * Localnet Metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("localnet")
    public LocalnetMetadata localnet;
    /**
     * Testing Metadata
     * <p>
     * 
     * 
     */
    @JsonProperty("testing")
    public TestingMetadata testing;
    /**
     * Pointset Metadata
     * <p>
     * Pointset representing the abstract system expectation for what the device should be doing, and how it should be configured and operated. This block specifies the expected points that a device holds
     * 
     */
    @JsonProperty("pointset")
    @JsonPropertyDescription("Pointset representing the abstract system expectation for what the device should be doing, and how it should be configured and operated. This block specifies the expected points that a device holds")
    public PointsetMetadata pointset;

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.cloud == null)? 0 :this.cloud.hashCode()));
        result = ((result* 31)+((this.system == null)? 0 :this.system.hashCode()));
        result = ((result* 31)+((this.testing == null)? 0 :this.testing.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.pointset == null)? 0 :this.pointset.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.hash == null)? 0 :this.hash.hashCode()));
        result = ((result* 31)+((this.gateway == null)? 0 :this.gateway.hashCode()));
        result = ((result* 31)+((this.localnet == null)? 0 :this.localnet.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return (((((((((((this.cloud == rhs.cloud)||((this.cloud!= null)&&this.cloud.equals(rhs.cloud)))&&((this.system == rhs.system)||((this.system!= null)&&this.system.equals(rhs.system))))&&((this.testing == rhs.testing)||((this.testing!= null)&&this.testing.equals(rhs.testing))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.pointset == rhs.pointset)||((this.pointset!= null)&&this.pointset.equals(rhs.pointset))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.hash == rhs.hash)||((this.hash!= null)&&this.hash.equals(rhs.hash))))&&((this.gateway == rhs.gateway)||((this.gateway!= null)&&this.gateway.equals(rhs.gateway))))&&((this.localnet == rhs.localnet)||((this.localnet!= null)&&this.localnet.equals(rhs.localnet))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
