import { Helmet } from "react-helmet";
import useCurrentUserInfo from "./userApi";

export default function Home() {
  const { data: userInfo } = useCurrentUserInfo();

  return (
    <div>
      <Helmet>
        <title>Home - Shiro AAD example application</title>
      </Helmet>
      <p>Hi, {userInfo?.username}! Welcome to Shiro AAD example application.</p>
      <p>
        You can:
        <ol>
          <li>
            <a href="/logout">Sign Out</a>
          </li>
          <li>
            {userInfo?.runAsUsername ? (
              <a href="/run-as-me">Run As {userInfo?.username}</a>
            ) : (
              <a href="/run-as?username=morulay">Run As another user</a>
            )}
          </li>
        </ol>
      </p>
    </div>
  );
}
