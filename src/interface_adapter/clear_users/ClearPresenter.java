package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

// TODO Complete me

public class ClearPresenter implements ClearOutputBoundary {

    private String successMessage;
    private String errorMessage;

    @Override
    public void prepareSuccessView(ClearOutputData outputData) {
        // Process the successful output data and prepare it for presentation.
        // This example simply assumes ClearOutputData has a getMessage() method.
        // Modify accordingly if it's different.
        successMessage = "Success: " + outputData.getMessage();
    }

    @Override
    public void prepareFailView(ClearOutputData errorData) {
        // Process the failed output data and prepare it for presentation.
        // This example assumes ClearOutputData has a getMessage() method.
        errorMessage = "Error: " + errorData.getMessage();
    }

    // Getter methods to retrieve the processed messages,
    // which can be used by other classes (e.g., a UI layer).

    public String getSuccessMessage() {
        return successMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
