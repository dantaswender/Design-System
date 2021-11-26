package br.com.wdr.design_system.alert.dialog

import android.content.Context
import br.com.wdr.design_system.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

object AlertDialog {

    fun dialogPositiveButtom(
        context: Context, title: String, message: String, onclick: (() -> Unit)?
    ) {
        MaterialAlertDialogBuilder(
            context
        )
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton(context.getString(R.string.ok)) { dialog, _ ->
                dialog.dismiss()
                onclick?.let { it.invoke() }
            }
            .show()
    }

}