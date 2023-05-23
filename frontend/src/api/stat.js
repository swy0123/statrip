import { apiInstance } from "./index.js";

const api = apiInstance();

async function getUserStat(userId, success, fail) {
    console.log("sssssssss1111111111")
    await api.get('/stat/' + userId).then(success).catch(fail);
}

async function getMyStat(success, fail) {
    console.log("sssssssss2222222")
    api.defaults.headers["access-token"] = sessionStorage.getItem("access-token");
    await api.get('/share/my').then(success).catch(fail);
}

export { getUserStat, getMyStat };
