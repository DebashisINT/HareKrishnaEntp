package com.breezefieldkrishnatea.features.task.api

import com.breezefieldkrishnatea.features.timesheet.api.TimeSheetApi
import com.breezefieldkrishnatea.features.timesheet.api.TimeSheetRepo

/**
 * Created by Saikat on 12-Aug-20.
 */
object TaskRepoProvider {
    fun taskRepoProvider(): TaskRepo {
        return TaskRepo(TaskApi.create())
    }
}