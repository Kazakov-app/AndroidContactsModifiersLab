package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

class FilterContactUiState {
    private boolean isApplyEnable = false;

    public void setApplyEnable(boolean applyEnable) {
        isApplyEnable = applyEnable;
    }

    public boolean isApplyEnable() {
        return isApplyEnable;
    }

    public Set<ContactType> newSelectedContactTypes = Collections.emptySet();
}
