package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private final boolean operationSuccessful;
    private final String message;

    public ClearOutputData(boolean operationSuccessful, String message) {
        this.operationSuccessful = operationSuccessful;
        this.message = message;
    }

    public boolean isOperationSuccessful() {
        return operationSuccessful;
    }

    public String getMessage() {
        return message;
    }
}
