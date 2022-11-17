@echo off
SET  "result=0"
:verifdocker(result)
    echo *****Verifying Docker installation******
    docker ps -a
    if %ERRORLEVEL% NEQ 0 (
        echo Docker is not installed
        echo Please install Docker and run this script again
        set result=0
        echo %OS%
        if %OS% == "Windows_NT" (
            echo You can download Docker from https://www.docker.com/products/docker-desktop
        ) else (
            echo You can download Docker from https://docs.docker.com/install/
        )

    )else (
    set result=1
        echo Docker is installed
        REM assuming docker is installed, we can now run the docker-compose file
        REM Path: src\Scripts\docker_run.bat
        docker run
        REM dg
    )

:verifdocker
echo "RESULT " %result%