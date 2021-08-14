import { Helmet } from "react-helmet";

export default function Lobby() {
  return (
    <div>
      <Helmet>
        <title>Lobby - Shiro AAD example application</title>
      </Helmet>
      <p>Welcome to Shiro AAD example application lobby</p>
      <p>
        To enter the application, please <a href="/login">Sing In</a>
      </p>
    </div>
  );
}
