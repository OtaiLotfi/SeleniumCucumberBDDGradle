package it.otai.e2e.configurations;

import io.cucumber.java.ParameterType;

public class OtaiUserCredentials {
    @SuppressWarnings("unused")
    public enum OtaiUser {
        INTERN,
        EBAY,
        ORANGEHRM,
        ADMIN_TWO,
        NO_ROLES;

        private static final String PROPERTY_PATTERN = "ebay-ui-e2e.users.credentials.%s-username";

        public String getPropertyKeyUsername() {
            return String.format(PROPERTY_PATTERN, this.name().toLowerCase());
        }
    }

    @ParameterType(".*")
    public OtaiUser ebayUser(String name) {
        return OtaiUser.valueOf(name);
    }

    @SuppressWarnings("unused")
    public enum OtaiPassword {
        INTERN,
        EBAY,
        ORANGEHRM,
        ADMIN_TWO,
        NO_ROLES;

        private static final String PROPERTY_PATTERN = "ebay-ui-e2e.users.credentials.%s-password";

        public String getPropertyKeyPassword() {
            return String.format(PROPERTY_PATTERN, this.name().toLowerCase());
        }
    }

    @ParameterType(".*")
    public OtaiPassword ebayPassword(String name) {
        return OtaiPassword.valueOf(name);
    }
}
