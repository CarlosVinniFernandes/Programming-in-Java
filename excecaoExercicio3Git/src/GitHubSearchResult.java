import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GitHubSearchResult {
    @SerializedName("total_count")
    private int totalCount;

    @SerializedName("items")
    private List<GitHubUser>  users;

    public int getTotalCount(){
        return totalCount;
    }

    public List<GitHubUser> getUsers(){
        return users;
    }

    public static class GitHubUser{
        private String login;

        @SerializedName("html_url")
        private String url;

        @SerializedName("avatar_url")
        private String avatarUrl;

        public String getLogin(){
            return login;
        }
        public String getUrl(){
            return url;
        }

        public String getAvatarUrl(){
            return avatarUrl;
        }
    }
}
