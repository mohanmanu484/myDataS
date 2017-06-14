import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by mohan on 28/05/17.
 */

public class Message {


    public static void main(String[] args) {

        System.out.println(sendSms());
    }

    //642fa96f1e0181d0ca36f942c1ac10bddbe7cb32nS8nYQKweJtaZ1yQ6vk1f9qyJ

    public static String sendSms() {

        /*Request

        Request.Post("https://textbelt.com/text").bodyForm(Normalizer.Form.form()
                .add("phone", "9483730666")
                .add("message", "Hello world")
                .add("key", "textbelt")
                .build())
                .execute().returnContent();
*/




        try {
            // Construct data
            String user = "username=" + "mohanmanu484@gmail.com";
            String hash = "&hash=" + "15cc5c7e2f618ff259ba3cd86a38fcf9e898ef7f2ad3a0b8349fa54a148a2e25";
            String message = "&message=" + "yes got ur message";
            String sender = "&sender=" + "TXTLCL";
            String numbers = "&numbers=" + "8197576417";

            // Send data
            HttpURLConnection conn = (HttpURLConnection) new URL("http://api.textlocal.in/send/?").openConnection();
            String data = user + hash + numbers + message + sender;
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
            conn.getOutputStream().write(data.getBytes("UTF-8"));
            final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            final StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = rd.readLine()) != null) {
                stringBuffer.append(line);
            }
            rd.close();

            return stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("Error SMS "+e);
            return "Error "+e;
        }
    }
}
