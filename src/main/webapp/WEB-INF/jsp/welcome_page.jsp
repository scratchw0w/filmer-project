<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>
    <head>
        <title>FilmChooser</title>
        <script src="http://code.jquery.com/jquery-1.11.0.min.js" defer></script>
        <script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js" defer></script>
        <script src="${pageContext.request.contextPath}/scripts/mainPageScript.js" defer></script>
    </head>

    <body>
        <h3>WELCOME!</h3>

        <div id="wrapper">
            <div id="header">
                <h3>Choose your favourite genre:</h3>
            </div>
        </div>

        <div id="classList">
            <div id="content">
                <table>
                    <tr>
                        <th>
                            <button id="action" onclick="actionFunc()">
                                Action
                            </button>
                        </th>
                        <th>
                            <button id="adventure" onclick="adventureFunc()">
                                Adventure
                            </button>
                        </th>
                        <th>
                            <button id="drama" onclick="dramaFunc()">
                                Drama
                            </button>
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <button id="comedy" onclick="comedyFunc()">
                                Comedy
                            </button>
                        </th>
                        <th>
                            <button id="crime" onclick="crimeFunc()">
                                Crime
                            </button>
                        </th>
                        <th>
                            <button id="fantasy" onclick="fantasyFunc()">
                                Fantasy
                            </button>
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <button id="horror" onclick="horrorFunc()">
                                Horror
                            </button>
                        </th>
                        <th>
                            <button id="historical" onclick="historicalFunc()">
                                Historical
                            </button>
                        </th>
                        <th>
                            <button id="mystery" onclick="mysteryFunc()">
                                Mystery
                            </button>
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <button
                                id="philosophical"
                                onclick="philosophicalFunc()"
                            >
                                Philosophical
                            </button>
                        </th>
                        <th>
                            <button id="romance" onclick="romanceFunc()">
                                Romance
                            </button>
                        </th>
                        <th>
                            <button id="satire" onclick="satireFunc()">
                                Satire
                            </button>
                        </th>
                    </tr>
                    <tr>
                        <th>
                            <button id="social" onclick="socialFunc()">
                                Social
                            </button>
                        </th>
                        <th>
                            <button id="thriller" onclick="thrillerFunc()">
                                Thriller
                            </button>
                        </th>
                        <th>
                            <button id="western" onclick="westernFunc()">
                                Western
                            </button>
                        </th>

                        <th>
                            <input
                                id="reset"
                                type="button"
                                value="Reset"
                                onclick="clearFunc()"
                            />
                        </th>
                    </tr>
                </table>
                <input
                    id="checkout"
                    type="button"
                    onclick="checkoutFunc()"
                    value="Next"
                />
            </div>
        </div>
    </body>
</html>
