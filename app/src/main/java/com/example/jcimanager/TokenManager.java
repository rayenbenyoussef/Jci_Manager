package com.example.jcimanager;

import android.content.Context;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;

class TokenData {
    private String token;
    private String expiryDate; // store as ISO string

    public TokenData(String token, LocalDateTime expiryDate) {
        this.token = token;
        this.expiryDate = expiryDate.toString(); // store as string
    }

    // Getters
    public String getToken() { return token; }
    public String getExpiryDate() { return expiryDate; }
}

public  class TokenManager {

    private static final String FILE_NAME = "token.json";

    public static void saveToken(Context context, String token, LocalDateTime expiry) {
        TokenData data = new TokenData(token, expiry);
        Gson gson = new Gson();

        try (FileOutputStream fos = context.openFileOutput(FILE_NAME, Context.MODE_PRIVATE)) {
            String json = gson.toJson(data);
            fos.write(json.getBytes());
            System.out.println("Token saved internally!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TokenData readToken(Context context) {
        Gson gson = new Gson();
        File file = new File(context.getFilesDir(), FILE_NAME);

        if (!file.exists()) return null;

        try (FileReader reader = new FileReader(file)) {
            return gson.fromJson(reader, TokenData.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteToken(Context context) {
        File file = new File(context.getFilesDir(), FILE_NAME);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Token deleted!");
            } else {
                System.out.println("Failed to delete token.");
            }
        }
    }

    /** Check if token is expired */
    public static boolean isTokenExpired(TokenData data) {
        if (data == null) return true;
        return LocalDateTime.parse(data.getExpiryDate()).isBefore(LocalDateTime.now());
    }

}
