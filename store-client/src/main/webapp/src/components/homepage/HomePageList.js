import React from "react";
import {
  Button,
  Container,
  List,
  ListItem,
  ListItemIcon,
} from "@material-ui/core";
import { Search, Settings, Visibility } from "@material-ui/icons";

class HomePageList extends React.Component {
  render() {
    return (
      <div>
        <Container maxWidth="200">
          <List>
            <ListItem>
              <Button variant="contained" fullWidth="true">
                <ListItemIcon>
                  <Search />
                </ListItemIcon>
                Search Inventory
              </Button>
            </ListItem>
            <ListItem>
              <Button variant="contained" fullWidth="true">
                <ListItemIcon>
                  <Visibility />
                </ListItemIcon>
                Views Orders
              </Button>
            </ListItem>
            <ListItem>
              <Button variant="contained" fullWidth="true">
                <ListItemIcon>
                  <Settings />
                </ListItemIcon>
                Manage Inventory
              </Button>
            </ListItem>
          </List>
        </Container>
      </div>
    );
  }
}

export default HomePageList;
