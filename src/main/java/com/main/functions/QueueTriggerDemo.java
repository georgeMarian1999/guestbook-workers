package com.main.functions;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.QueueTrigger;

public class QueueTriggerDemo {

    @FunctionName("QueueTriggerDemo")
    public void run(
            @QueueTrigger(name = "message", queueName = "guestbook-file-queue", connection = "AzureWebJobsStorage") String message,
            final ExecutionContext context
    ) {
        context.getLogger().info("Queue message: " + message);
    }
}