package use_cases.user_registration_use_cases;

public interface UserVerificationOutputBoundary {
    void getLoginCredentials();
    void cannotVerify();
}
