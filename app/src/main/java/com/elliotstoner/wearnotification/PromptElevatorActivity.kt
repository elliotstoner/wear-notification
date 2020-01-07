package com.elliotstoner.wearnotification

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class PromptElevatorActivity : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prompt_elevator)

        // Enables Always-on
        setAmbientEnabled()
    }
}
