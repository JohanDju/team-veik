package veik.team

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    val server = embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText("Hello Marius!", ContentType.Text.Plain)
            }
            get("/solskjaer") {
                call.respondText("Solskjær kan gå på vannet... \nhttp://solskjaertabellen.com/")
            }
        }
    }
    server.start(wait = true)
}
