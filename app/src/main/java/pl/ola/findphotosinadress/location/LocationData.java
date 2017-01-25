
package pl.ola.findphotosinadress.location;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationData {

    @SerializedName("results")
    @Expose
    public List<Result> results;

    @SerializedName("status")
    @Expose
    public String status;

}
