package interface_adapter.clear_users;


import interface_adapter.ViewModel;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

// TODO Complete me

public class ClearViewModel {

    private ClearState state = new ClearState();
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);

    public ClearViewModel() {
        // Removed the super("clear users"); line
    }

    public void setState(ClearState state) {
        this.state = state;
    }

    public ClearState getState() {
        return state;
    }

    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
