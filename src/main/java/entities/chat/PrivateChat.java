package entities.chat;

import java.util.ArrayList;

public class PrivateChat extends Chat {

    /*
    From Chat, PrivateChat has:
        String name;
        String chatID;
        String senderUsername;
        Arraylist<Message> convHist;
     */
    protected String recipientUsername;
    protected String senderUsername;

    /**
     * Create a private chat
     *
     * @param name  The name of the chat (also the username of the recipient)
     * @param chatID The ID of the chat
     * @param recipientUsername The user receiving the messages
     *
     *
     */
    public PrivateChat(String name, String chatID, String recipientUsername ){
        this.name = name;
        this.chatID = chatID;
        this.recipientUsername = recipientUsername;
        this.convHist = new ArrayList<>();

    }




    /**
     * Get the recipient's username
     * @return senderRecipient
     */
    public String getRecipientUsername(){
        return this.recipientUsername;
    }

    public void setRecipientUsername(String recipientUsername) {
        this.recipientUsername= recipientUsername;
    }

    public String getRecipientUsername(String recipientUsername) {
        return this.recipientUsername;
    }

    public String getSenderUsername(){
        return this.senderUsername;
    }
    public void setSenderUsername(String recipientUsername){
        this.recipientUsername = recipientUsername;
    }


}
