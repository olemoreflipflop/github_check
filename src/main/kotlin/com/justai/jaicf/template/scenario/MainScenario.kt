package com.justai.jaicf.template.scenario

import com.justai.jaicf.builder.Scenario

val mainScenario = Scenario {
    state("Start") {
        globalActivators {
            regex("/start")
        }
        action {
            reactions.say("Начнём!")
        }
    }

    state("Hello") {
        activators {
            intent("Hello")
        }

        action {
            reactions.say("Привет!")
        }
    }

    state("Bye") {
        activators {
            intent("Bye")
        }

        action {
            reactions.say("Скоро увидимся!")
        }
    }

    fallback {
        reactions.say("Мне пока нечего сказать...")
    }
}