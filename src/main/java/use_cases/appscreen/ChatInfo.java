package use_cases.appscreen;

import entities.chat.Chat;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChatInfo {

    private final ArrayList<Chat> userChats;
    private final String chatID;

    /**
     * Create an object pertaining to chat information
     * @param chatID ID of the chat in context
     */
    public ChatInfo(ArrayList<Chat> chats, String chatID){
        this.userChats = chats;
        this.chatID = chatID;
    }
    /**
     * Get the name of the chat
     * @return chat name
     */
    public String getChatName(){
        try{
            for (Chat chat: userChats){
                if (chat.getChatID().equals(chatID)){
                    return chat.getName();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to get indicated chat");
        }
        return null;
    }

    /**
     * Return the date and time of the last message the chat
     * @return date and time of last update
     */
    public LocalDateTime getLastMessageTime(){
        try{
            for (Chat chat: userChats){
                if (chat.getChatID().equals(chatID)){
                    return chat.getLastUpdated();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Unable to get indicated chat");
        }
        return null;
    }

}
