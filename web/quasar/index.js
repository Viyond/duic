import Quasar, {
  // plugins
  Dialog,
  Loading,
  Notify,
  Cookies,
  // components
  QDialog,
  QAjaxBar,
  QAvatar,
  QBtn,
  QBtnDropdown,
  QBtnToggle,
  QCard,
  QCardActions,
  QCardSection,
  QDrawer,
  QFooter,
  QForm,
  QHeader,
  QIcon,
  QInput,
  // form
  QItem,
  QItemLabel,
  // card
  QItemSection,
  QLayout,
  QList,
  // table
  QTable,
  QTh,
  QTr,
  QTd,
  // tab
  QTabs,
  QRouteTab,
  QPage,
  QPageContainer,
  QSpace,
  QToolbar,
  QToolbarTitle
} from "quasar";
import langZhHans from "quasar/lang/zh-hans";
import iconSet from "quasar/icon-set/mdi-v3";
import "@quasar/extras/mdi-v3/mdi-v3.css";
import "./quasar-variables.styl";
import Vue from "vue";

Vue.use(Quasar, {
  lang: langZhHans,
  iconSet,
  components: {
    QDialog,
    QAjaxBar,
    QLayout,
    QPageContainer,
    QPage,
    QHeader,
    QFooter,
    QDrawer,
    QAvatar,
    QToolbar,
    QToolbarTitle,
    QBtn,
    QBtnDropdown,
    QIcon,
    QList,
    QItem,
    QItemLabel,
    QItemSection,
    QForm,
    QInput,
    QCard,
    QCardSection,
    QCardActions,
    QBtnToggle,
    QSpace,
    QTable,
    QTh,
    QTr,
    QTd,
    QTabs,
    QRouteTab
  },
  plugins: {
    Loading,
    Dialog,
    Notify,
    Cookies
  }
});
