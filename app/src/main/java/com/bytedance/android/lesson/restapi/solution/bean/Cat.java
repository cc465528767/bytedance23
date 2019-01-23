package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName(value = "breeds")
    private List<String> breeds;

    @SerializedName(value = "id")
    private String id;
    @SerializedName(value = "url")
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getBreeds() {
        return breeds;
    }

    public void setBreeds(List<String> breeds) {
        this.breeds = breeds;
    }



    private static class Categorie {
        @SerializedName("id") private int id;
        @SerializedName("name") private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
