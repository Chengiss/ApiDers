
package booking;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.hamcrest.Matchers;

import java.util.Map;


public class Bookingdates {

    private String checkin;
    private String checkout;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

}
