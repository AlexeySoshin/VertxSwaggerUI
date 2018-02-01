import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

public class Main {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        Router router = Router.router(vertx);

        router.route("/*").handler(StaticHandler.create());


        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
