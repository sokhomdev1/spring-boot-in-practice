package com.auth.service;

public interface AuditService {
    public void logEntityChange(String entityName, Long entityId, String action, String oldValue, String newValue);
}
