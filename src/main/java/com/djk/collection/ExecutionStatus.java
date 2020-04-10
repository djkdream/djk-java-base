package com.djk.collection;

public enum ExecutionStatus {
    SUBMITTED_SUCCESS,
    RUNNING_EXEUTION,
    READY_PAUSE,
    PAUSE,
    READY_STOP,
    STOP,
    FAILURE,
    SUCCESS,
    NEED_FAULT_TOLERANCE,
    KILL,
    WAITTING_THREAD,
    WAITTING_DEPEND;

    private ExecutionStatus() {
    }

    public boolean typeIsSuccess() {
        return this == SUCCESS;
    }

    public boolean typeIsFailure() {
        return this == FAILURE || this == NEED_FAULT_TOLERANCE;
    }

    public boolean typeIsFinished() {
        return this.typeIsSuccess() || this.typeIsFailure() || this.typeIsCancel() || this.typeIsPause() || this.typeIsWaittingThread();
    }

    public boolean typeIsWaittingThread() {
        return this == WAITTING_THREAD;
    }

    public boolean typeIsPause() {
        return this == PAUSE;
    }

    public boolean typeIsRunning() {
        return this == RUNNING_EXEUTION || this == WAITTING_DEPEND;
    }

    public boolean typeIsCancel() {
        return this == KILL || this == STOP;
    }
}
