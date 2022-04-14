package com.spoon.backgroundfileupload;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.work.Data;

@Entity(tableName = "pending_upload")
public class PendingUpload {
    @PrimaryKey
    @NonNull
    private String id;

    @ColumnInfo(name = "output_data")
    @NonNull
    private Data outputData;

    @ColumnInfo(name = "state")
    @NonNull
    private String state;

    public PendingUpload(@NonNull final String id, @NonNull final Data outputData, @NonNull final String state) {
        this.id = id;
        this.outputData = outputData;
        this.state = state; // Pending, Uploading
    }

    @NonNull
    public String getId() {
        return id;
    }

    @NonNull
    public Data getOutputData() {
        return outputData;
    }

    @NonNull
    public String getState() {
        return state;
    }
}