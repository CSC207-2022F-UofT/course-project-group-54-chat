package conversation_history_use_case;

public class MsgSenderRequestModel {
    private String senderID;
    private Object msgContent;
    private String userID;
    private String chatID;

    public MsgSenderRequestModel(String senderID, Object msgContent, String userID, String chatID) {
        this.senderID = senderID;
        this.msgContent = msgContent;
        this.userID = userID;
        this.chatID = chatID;
    }

    public String getSenderID() {
        return senderID;
    }

    public void setSenderID(String senderID) {
        this.senderID = senderID;
    }

    public Object getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(Object msgContent) {
        this.msgContent = msgContent;
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
