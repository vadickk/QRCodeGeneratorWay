package com.main.generation_from_text.domain.dialog

import android.app.Dialog
import android.content.Context

interface ManageGeneratedDialogFromText {

    fun createDialog(context: Context): Dialog
}