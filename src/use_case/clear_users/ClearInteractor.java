package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface, ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute() {
        try {
            userDataAccessObject.clearAllUsers();
            ClearOutputData outputData = new ClearOutputData(true, "All users cleared successfully.");
            clearPresenter.prepareSuccessView(outputData);
        } catch (Exception e) {
            ClearOutputData outputData = new ClearOutputData(false, e.getMessage());
            clearPresenter.prepareFailView(outputData);
        }
    }
}
