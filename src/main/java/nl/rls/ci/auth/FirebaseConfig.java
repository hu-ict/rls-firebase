package nl.rls.ci.auth;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.*;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Configuration
public class FirebaseConfig {
    public static void Config() {
        FileInputStream serviceAccount = null;
        try {
            serviceAccount = new FileInputStream("C:/Users/jasper/Downloads/hutest-691be-firebase-adminsdk-9009v-f71e86b5fc.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FirebaseOptions options = null;
        try {
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FirebaseApp.initializeApp(options);
    }

}
