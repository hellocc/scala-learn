statusListener(OnConsoleStatusListener)

def appenderList = ["CONSOLE"]
def consoleAppender = true;

if (consoleAppender) {
  appender("CONSOLE", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
      pattern = "%d{yyyy:HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
    }
  }
}
logger("com.caowei", DEBUG,appenderList)
//root(INFO, appenderList)