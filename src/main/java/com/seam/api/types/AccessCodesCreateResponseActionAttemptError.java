package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesCreateResponseActionAttemptError.Builder.class)
public final class AccessCodesCreateResponseActionAttemptError {
    private final String actionType;

    private final String actionAttemptId;

    private final Optional<String> result;

    private final AccessCodesCreateResponseActionAttemptErrorError error;

    private int _cachedHashCode;

    AccessCodesCreateResponseActionAttemptError(
            String actionType,
            String actionAttemptId,
            Optional<String> result,
            AccessCodesCreateResponseActionAttemptErrorError error) {
        this.actionType = actionType;
        this.actionAttemptId = actionAttemptId;
        this.result = result;
        this.error = error;
    }

    @JsonProperty("action_type")
    public String getActionType() {
        return actionType;
    }

    @JsonProperty("action_attempt_id")
    public String getActionAttemptId() {
        return actionAttemptId;
    }

    @JsonProperty("result")
    public Optional<String> getResult() {
        return result;
    }

    @JsonProperty("error")
    public AccessCodesCreateResponseActionAttemptErrorError getError() {
        return error;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesCreateResponseActionAttemptError
                && equalTo((AccessCodesCreateResponseActionAttemptError) other);
    }

    private boolean equalTo(AccessCodesCreateResponseActionAttemptError other) {
        return actionType.equals(other.actionType)
                && actionAttemptId.equals(other.actionAttemptId)
                && result.equals(other.result)
                && error.equals(other.error);
    }

    @Override
    public int hashCode() {
        if (_cachedHashCode == 0) {
            _cachedHashCode = Objects.hash(this.actionType, this.actionAttemptId, this.result, this.error);
        }
        return _cachedHashCode;
    }

    @Override
    public String toString() {
        return "AccessCodesCreateResponseActionAttemptError{" + "actionType: " + actionType + ", actionAttemptId: "
                + actionAttemptId + ", result: " + result + ", error: " + error + "}";
    }

    public static ActionTypeStage builder() {
        return new Builder();
    }

    public interface ActionTypeStage {
        ActionAttemptIdStage actionType(String actionType);

        Builder from(AccessCodesCreateResponseActionAttemptError other);
    }

    public interface ActionAttemptIdStage {
        ErrorStage actionAttemptId(String actionAttemptId);
    }

    public interface ErrorStage {
        _FinalStage error(AccessCodesCreateResponseActionAttemptErrorError error);
    }

    public interface _FinalStage {
        AccessCodesCreateResponseActionAttemptError build();

        _FinalStage result(Optional<String> result);

        _FinalStage result(String result);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionTypeStage, ActionAttemptIdStage, ErrorStage, _FinalStage {
        private String actionType;

        private String actionAttemptId;

        private AccessCodesCreateResponseActionAttemptErrorError error;

        private Optional<String> result = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesCreateResponseActionAttemptError other) {
            actionType(other.getActionType());
            actionAttemptId(other.getActionAttemptId());
            result(other.getResult());
            error(other.getError());
            return this;
        }

        @Override
        @JsonSetter("action_type")
        public ActionAttemptIdStage actionType(String actionType) {
            this.actionType = actionType;
            return this;
        }

        @Override
        @JsonSetter("action_attempt_id")
        public ErrorStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @Override
        @JsonSetter("error")
        public _FinalStage error(AccessCodesCreateResponseActionAttemptErrorError error) {
            this.error = error;
            return this;
        }

        @Override
        public _FinalStage result(String result) {
            this.result = Optional.of(result);
            return this;
        }

        @Override
        @JsonSetter(value = "result", nulls = Nulls.SKIP)
        public _FinalStage result(Optional<String> result) {
            this.result = result;
            return this;
        }

        @Override
        public AccessCodesCreateResponseActionAttemptError build() {
            return new AccessCodesCreateResponseActionAttemptError(actionType, actionAttemptId, result, error);
        }
    }
}
