package com.brianegan.bansa.counter

import com.brianegan.bansa.Reducer

class CounterReducer : Reducer<ApplicationState, CounterAction> {
    override fun reduce(state: ApplicationState, action: CounterAction): ApplicationState {
        when (action) {
            is CounterActions.INIT -> return ApplicationState()
            is CounterActions.INCREMENT -> return state.copy(counter = state.counter.plus(1))
            is CounterActions.DECREMENT -> return state.copy(counter = state.counter.minus(1))
            else -> return state
        }
    }
}

