package edu.sru.group7.roomallocation.secure;

@SuppressWarnings("serial")
public class UnauthenticatedUserException extends RuntimeException {
    public UnauthenticatedUserException() {
        super("User is not authenticated");
    }
}

