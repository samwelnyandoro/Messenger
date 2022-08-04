package dev.samwelnyandoro.messenger.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import dev.samwelnyandoro.messenger.service.model.ChatlistModel;
import dev.samwelnyandoro.messenger.service.repository.ChatsRepository;


public class ChatsViewModel extends ViewModel
{
    MutableLiveData<List<ChatlistModel>> chatlistmodel;
    private ChatsRepository chatsRepository;

    public void init()
    {
        if(chatlistmodel != null)
        {
            return;
        }
        chatsRepository = ChatsRepository.getInstance();
        chatlistmodel = chatsRepository.getChats();
    }

    public LiveData<List<ChatlistModel>> getChatlistmodel()
    {
        return chatlistmodel;
    }
}