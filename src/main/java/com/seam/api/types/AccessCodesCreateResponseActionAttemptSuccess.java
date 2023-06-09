package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Objects;
import java.util.Optional;

@JsonDeserialize(builder = AccessCodesCreateResponseActionAttemptSuccess.Builder.class)
public final class AccessCodesCreateResponseActionAttemptSuccess {
    private final String actionType;

    private final String actionAttemptId;

    private final Optional<Object> result;

    private final Optional<String> error;

    private int _cachedHashCode;

    AccessCodesCreateResponseActionAttemptSuccess(
            String actionType, String actionAttemptId, Optional<Object> result, Optional<String> error) {
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
    public Optional<Object> getResult() {
        return result;
    }

    @JsonProperty("error")
    public Optional<String> getError() {
        return error;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof AccessCodesCreateResponseActionAttemptSuccess
                && equalTo((AccessCodesCreateResponseActionAttemptSuccess) other);
    }

    private boolean equalTo(AccessCodesCreateResponseActionAttemptSuccess other) {
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
        return "AccessCodesCreateResponseActionAttemptSuccess{" + "actionType: " + actionType + ", actionAttemptId: "
                + actionAttemptId + ", result: " + result + ", error: " + error + "}";
    }

    public static ActionTypeStage builder() {
        return new Builder();
    }

    public interface ActionTypeStage {
        ActionAttemptIdStage actionType(String actionType);

        Builder from(AccessCodesCreateResponseActionAttemptSuccess other);
    }

    public interface ActionAttemptIdStage {
        _FinalStage actionAttemptId(String actionAttemptId);
    }

    public interface _FinalStage {
        AccessCodesCreateResponseActionAttemptSuccess build();

        _FinalStage result(Optional<Object> result);

        _FinalStage result(Object result);

        _FinalStage error(Optional<String> error);

        _FinalStage error(String error);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements ActionTypeStage, ActionAttemptIdStage, _FinalStage {
        private String actionType;

        private String actionAttemptId;

        private Optional<String> error = Optional.empty();

        private Optional<Object> result = Optional.empty();

        private Builder() {}

        @Override
        public Builder from(AccessCodesCreateResponseActionAttemptSuccess other) {
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
        public _FinalStage actionAttemptId(String actionAttemptId) {
            this.actionAttemptId = actionAttemptId;
            return this;
        }

        @Override
        public _FinalStage error(String error) {
            this.error = Optional.of(error);
            return this;
        }

        @Override
        @JsonSetter(value = "error", nulls = Nulls.SKIP)
        public _FinalStage error(Optional<String> error) {
            this.error = error;
            return this;
        }

        @Override
        public _FinalStage result(Object result) {
            this.result = Optional.of(result);
            return this;
        }

        @Override
        @JsonSetter(value = "result", nulls = Nulls.SKIP)
        public _FinalStage result(Optional<Object> result) {
            this.result = result;
            return this;
        }

        @Override
        public AccessCodesCreateResponseActionAttemptSuccess build() {
            return new AccessCodesCreateResponseActionAttemptSuccess(actionType, actionAttemptId, result, error);
        }
    }
}
