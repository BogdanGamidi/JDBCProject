package tables;

public class Posts {
    private int id;
    private String content_of_post;
    private int user_id;

    public Posts() {}
    public Posts(int id, String content_of_post, int user_id) {
        this.id = id;
        this.content_of_post = content_of_post;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent_of_post() {
        return content_of_post;
    }

    public void setContent_of_post(String content_of_post) {
        this.content_of_post = content_of_post;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Post " + id + ": [" + content_of_post + "]" + " by User ID " + user_id;
    }
}
