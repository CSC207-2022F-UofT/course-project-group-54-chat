package conversation_history_use_case;

public class ConvHistDsRequestModel {
    private String userID;
    private String chatID;

    public ConvHistDsRequestModel(String userID, String chatID) {
        this.userID = userID;
        this.chatID = chatID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getChatID() {
        return chatID;
    }

    public void setChatID(String chatID) {
        this.chatID = chatID;
    }
}
